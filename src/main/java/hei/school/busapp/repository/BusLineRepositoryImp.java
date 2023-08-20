package hei.school.busapp.repository;

import hei.school.busapp.connection.DatabaseConfig;
import hei.school.busapp.entity.BusLine;
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
public class BusLineRepositoryImp implements BusLineRepository{
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    Connection connection;

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
                                resultSet.getString ( "linenumber"),
                                resultSet.getString ( "linename")
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
                                resultSet.getString ( "linenumber"),
                                resultSet.getString ( "linename")
                        )
                );
            }
        } catch ( SQLException e ) {
            throw new RuntimeException ( e );
        }
        return busLines;
    }

    @Override
    public boolean addBusLine(BusLine busLine){
       try {
           connection = DatabaseConfig.getInstance ( ).getConnection ( );
           preparedStatement = connection.prepareStatement (
                   "INSERT INTO BusLine(linenumber, linename)" + "VALUES (?, ?);"
           );
           preparedStatement.setString ( 1, busLine.getLinenumber () );
           preparedStatement.setString ( 2, busLine.getLinename ( ) );
           int success = preparedStatement.executeUpdate ();
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
    public boolean updateBusLine(long id, BusLine busLine){
        try {
            connection = DatabaseConfig.getInstance ( ).getConnection ( );
            preparedStatement = connection.prepareStatement (
                    "UPDATE BusLine SET linenumber=?, linename=? WHERE id=?"
            );
            preparedStatement.setString ( 1, busLine.getLinenumber ( ) );
            preparedStatement.setString ( 2, busLine.getLinename ( ) );
            preparedStatement.setLong ( 3, id );
            if (preparedStatement.executeUpdate () == 1){
                return true;
            }
                return false;
        } catch ( SQLException e ) {
            throw new RuntimeException ( e );
        }
    }

    @Override
    public boolean patchBusLine(long id, String newBusLinename){
        try {
            connection = DatabaseConfig.getInstance ( ).getConnection ( );
            preparedStatement = connection.prepareStatement (
                    "UPDATE BusLine set linename=? where id = ?"
            );
            preparedStatement.setString ( 1, newBusLinename );
            preparedStatement.setLong ( 2, id );
            int success = preparedStatement.executeUpdate ();
            if (success == 1){
                return true;
            }else{
                return false;
            }
        } catch ( SQLException e ) {
            throw new RuntimeException ( e );
        }
    }

    @Override
    public boolean deleteBusLine(long id){
        try {
            connection = DatabaseConfig.getInstance ( ).getConnection ( );
            preparedStatement = connection.prepareStatement (
                    "DELETE FROM BusLine WHERE id = ?"
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
