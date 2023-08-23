package hei.school.busapp.repository;

import hei.school.busapp.connection.DatabaseConfig;
import hei.school.busapp.entity.Stop;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StopRepositoryImp implements StopRepository{
   private PreparedStatement preparedStatement;
   private ResultSet resultSet;
   private Connection connection;
   private StopRouteRepository repository;
   private StopBusLineRepository stopBusLineRepository;

    public StopRepositoryImp(StopRouteRepository repository, StopBusLineRepository stopBusLineRepository){

        this.repository = repository;
        this.stopBusLineRepository = stopBusLineRepository;
    }

    @Override
    public List<Stop> getAllStop(){
        List<Stop> stops = new ArrayList<> ();
        try {
            connection = DatabaseConfig.getInstance ( ).getConnection ( );
            preparedStatement = connection.prepareStatement (
                    "SELECT * FROM Stop"
            );
            resultSet = preparedStatement.executeQuery ( );
            while (resultSet.next ()){
                stops.add (
                        new Stop (
                                resultSet.getLong ( "id"),
                                resultSet.getString ( "stopName"),
                                resultSet.getFloat ( "longitude"),
                                resultSet.getFloat ( "latitude"),
                                this.repository.findRouteWithStopById ( resultSet.getLong ( "id" ) ),
                                this.stopBusLineRepository.finBusLineWithStopById ( resultSet.getLong ( "id") )
                        )
                );
            }
        } catch ( SQLException e ) {
            throw new RuntimeException ( e );
        }
        return stops;
    }

    @Override
    public List<Stop> getStopById(long id){
        List<Stop> stops = new ArrayList<> ();
        try {
            connection = DatabaseConfig.getInstance ( ).getConnection ( );
            preparedStatement = connection.prepareStatement (
                    "SELECT * FROM Stop WHERE id = ?"
            );
            preparedStatement.setLong ( 1, id );
            resultSet = preparedStatement.executeQuery ( );
            if (resultSet.next ( )){
                stops.add (
                        new Stop (
                                resultSet.getLong ( "id"),
                                resultSet.getString ( "stopName"),
                                resultSet.getFloat ( "longitude"),
                                resultSet.getFloat ( "latitude"),
                                this.repository.findRouteWithStopById ( resultSet.getLong ( "id" ) ),
                                this.stopBusLineRepository.finBusLineWithStopById ( resultSet.getLong ( "id") )
                        )
                );
            }
        } catch ( SQLException e ) {
            throw new RuntimeException ( e );
        }
        return stops;
    }

    @Override
    public boolean addStop(Stop stop){
        try {
            connection = DatabaseConfig.getInstance ( ).getConnection ( );
            preparedStatement = connection.prepareStatement (
                    "INSERT INTO Stop(stopName, longitude, latitude)"
                    + "VALUES (?, ?, ?)"
            );
            preparedStatement.setString ( 1, stop.getStopName () );
            preparedStatement.setFloat ( 2, stop.getLongitude () );
            preparedStatement.setFloat ( 3, stop.getLatitude () );
            int success = preparedStatement.executeUpdate ( );
            if (success == 1){
                return true;
            }else {
                return false;
            }
        } catch ( SQLException e ) {
            throw new RuntimeException ( e );
        }
    }

    @Override
    public boolean updateStop(long id, Stop stop){
        try {
            connection = DatabaseConfig.getInstance ( ).getConnection ( );
            preparedStatement = connection.prepareStatement (
                    "UPDATE Stop SET stopName=?, longitude=?, latitude=? WHERE id=?"
            );
            preparedStatement.setString ( 1, stop.getStopName () );
            preparedStatement.setFloat ( 2, stop.getLongitude () );
            preparedStatement.setFloat ( 3, stop.getLatitude () );
            preparedStatement.setLong ( 4, id );
            if (preparedStatement.executeUpdate () == 1){
                return true;
            }
            return false;
        } catch ( SQLException e ) {
            throw new RuntimeException ( e );
        }
    }

    @Override
    public boolean deleteStop(long id){
        try {
            connection = DatabaseConfig.getInstance ( ).getConnection ( );
            preparedStatement = connection.prepareStatement (
                    "DELETE FROM Stop WHERE id=?"
            );
            preparedStatement.setLong ( 1, id );
            if (preparedStatement.executeUpdate () == 1){
                return true;
            }else {
                return false;
            }
        } catch ( SQLException e ) {
            throw new RuntimeException ( e );
        }
    }
}
