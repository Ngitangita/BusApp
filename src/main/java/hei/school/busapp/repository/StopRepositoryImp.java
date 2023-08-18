package hei.school.busapp.repository;


import hei.school.busapp.connection.DatabaseConfig;
import hei.school.busapp.entity.Stop;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Repository
public class StopRepositoryImp implements StopRepository{
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    Connection connection;

    @Override
    public List<Stop> getAllStops(){
        List<Stop> stops = new ArrayList<> ();
        try {
            connection = DatabaseConfig.getInstance ( ).getConnection ( );
            preparedStatement = connection.prepareStatement ( "SELECT * FROM stop" );
            resultSet = preparedStatement.executeQuery ();
            while (resultSet.next()) {
                stops.add (
                        new Stop (
                                resultSet.getLong ( "id" ),
                                resultSet.getString ( "stopname" ),
                                resultSet.getFloat ( "longitude" ) ,
                                resultSet.getFloat ( "latitude" )
                                )
                );
            }
        } catch ( SQLException e ){
            e.printStackTrace ();
        }
        return stops;
    }

    @Override
    public List<Stop> getStopsById(long id){
        List<Stop> stop = new ArrayList<> (  );
        try {
            connection = DatabaseConfig.getInstance ( ).getConnection ( );
            preparedStatement =connection.prepareStatement ( "SELECT * FROM stop WHERE id = ?" );
            preparedStatement.setLong ( 1, id );
            resultSet = preparedStatement.executeQuery ();
            if (resultSet.next ()) {
                stop.add (
                        new Stop (
                                resultSet.getLong ( "id" ),
                                resultSet.getString ( "stopname" ),
                                resultSet.getFloat ( "longitude" ) ,
                                resultSet.getFloat ( "latitude" )
                        )
                );
            }
        } catch ( SQLException e ){
            e.printStackTrace ();
        }
        return stop;
    }

    @Override
    public boolean addStop(Stop stop){
        try {
            connection = DatabaseConfig.getInstance ( ).getConnection ( );
            preparedStatement = connection.prepareStatement (
                    "INSERT INTO stop(stopname, longitude, latitude) " +
                            "VALUES (?, ?, ?);"
            );
            preparedStatement.setString ( 1, stop.getStopName () );
            preparedStatement.setFloat ( 2, stop.getLongitude ());
            preparedStatement.setFloat ( 3, stop.getLatitude ());
            int success = preparedStatement.executeUpdate ();
            if (success == 1) {
                return true;
            } else {
                return false;
            }
        } catch ( SQLException e ){
            e.printStackTrace ();
            return false;
        }
    }

    @Override
    public boolean updateStop(long id, Stop stop){
        try{
            connection = DatabaseConfig.getInstance ( ).getConnection ( );
            preparedStatement =connection.prepareStatement (
                    "UPDATE stop set stopname=?, longitude=?, latitude=? where id = ?"
            );
            preparedStatement.setString ( 1, stop.getStopName () );
            preparedStatement.setFloat ( 2, stop.getLongitude ());
            preparedStatement.setFloat ( 3, stop.getLatitude ());
            preparedStatement.setLong ( 4, id);
            if (preparedStatement.executeUpdate () == 1) {
                return true;
            }
                return false;
        } catch ( SQLException e ){
            e.printStackTrace ();
            return false;
        }
    }

    @Override
    public boolean patchStop(long id, String newStopname){
        try{
            connection = DatabaseConfig.getInstance ( ).getConnection ( );
            preparedStatement =connection.prepareStatement (
                    "UPDATE stop set stopname=? where id = ?"
            );
            preparedStatement.setString ( 1, newStopname );
            preparedStatement.setLong ( 2, id);
            int success = preparedStatement.executeUpdate ();
            if (success == 1) {
                return true;
            } else {
                return false;
            }
        } catch ( SQLException e ){
            e.printStackTrace ();
            return false;
        }
    }
}
