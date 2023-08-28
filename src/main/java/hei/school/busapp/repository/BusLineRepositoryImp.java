package hei.school.busapp.repository;

import hei.school.busapp.connection.DatabaseConfig;
import hei.school.busapp.entity.BusLine;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Repository
public class BusLineRepositoryImp implements BusLineRepository{
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    private Connection connection;
    private final BusLineRouteRepository repository;
    private final StopBusLineRepository stopBusLineRepository;

    public BusLineRepositoryImp(BusLineRouteRepository repository, StopBusLineRepository stopBusLineRepository){

        this.repository = repository;
        this.stopBusLineRepository = stopBusLineRepository;
    }

    @Override
    public List<BusLine> getAllBusLine(){
        List<BusLine> busLines = new ArrayList<> (  );
        try {
            connection = DatabaseConfig.getInstance ( ).getConnection ( );
            preparedStatement = connection.prepareStatement (
                    "SELECT * FROM BusLine"
            );
            resultSet = preparedStatement.executeQuery ( );
            while (resultSet.next ()){
                busLines.add (
                        new BusLine (
                                resultSet.getLong ( "id"),
                                resultSet.getString ( "lineNumber"),
                                this.repository.findRouteWithBusLineById( resultSet.getLong ( "id" ) ),
                                this.stopBusLineRepository.findStopWithBusLineById ( resultSet.getLong ( "id") )
                        )
                );
            }
        } catch ( SQLException e ) {
            throw new RuntimeException ( e );
        }
        return busLines;
    }

    @Override
    public List<BusLine> getBusLineById(long id){
        List<BusLine> busLines = new ArrayList<> (  );
        try {
            connection = DatabaseConfig.getInstance ( ).getConnection ( );
            preparedStatement = connection.prepareStatement (
                    "SELECT * FROM BusLine WHERE id = ?"
            );
            preparedStatement.setLong ( 1, id );
            resultSet = preparedStatement.executeQuery ( );
            if (resultSet.next ()){
                busLines.add (
                        new BusLine (
                                resultSet.getLong ( "id"),
                                resultSet.getString ( "lineNumber"),
                                this.repository.findRouteWithBusLineById( resultSet.getLong ( "id" ) ),
                                this.stopBusLineRepository.findStopWithBusLineById ( resultSet.getLong ( "id") )
                        )
                );
            }
        } catch ( SQLException e ) {
            throw new RuntimeException ( e );
        }
        return busLines;
    }

    @Override
    public void addBusLine(BusLine busLine){
        try {
            connection = DatabaseConfig.getInstance ( ).getConnection ( );
            preparedStatement = connection.prepareStatement (
                    "INSERT INTO BusLine(lineNumber)" + "VALUES (?)"
            );
            preparedStatement.setString ( 1, busLine.getLinenumber ( ) );
            preparedStatement.executeUpdate (  );
        } catch ( SQLException e ) {
            throw new RuntimeException ( e );
        }
    }


    @Override
    public void updateBusLine(long id, BusLine busLine){
        try {
            connection = DatabaseConfig.getInstance ( ).getConnection ( );
            preparedStatement = connection.prepareStatement (
                    "UPDATE BusLine SET lineNumber=? WHERE id=?"
            );
            preparedStatement.setString ( 1, busLine.getLinenumber () );
            preparedStatement.setLong ( 2, id );
            preparedStatement.executeUpdate ( );
        } catch ( SQLException e ) {
            throw new RuntimeException ( e );
        }
    }

    @Override
    public void deleteBusLine(long id){
        try {
            connection = DatabaseConfig.getInstance ( ).getConnection ( );
            preparedStatement = connection.prepareStatement (
                    "DELETE FROM BusLine WHERE id = ?"
            );
            preparedStatement.setLong ( 1, id );
            preparedStatement.executeUpdate ( );
        } catch ( SQLException e ) {
            throw new RuntimeException ( e );
        }
    }
}
