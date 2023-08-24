package hei.school.busapp.repository;

import hei.school.busapp.connection.DatabaseConfig;
import hei.school.busapp.entity.BusLine;
import hei.school.busapp.entity.Stop;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StopBusLineRepository {

    private Stop mapResultSetToBusLine(ResultSet resultSet) throws SQLException{
        Stop stop = new Stop ();
        stop.setId ( resultSet.getLong ( "id") );
        stop.setStopName ( resultSet.getString ( "stopName" ) );
        stop.setLongitude ( resultSet.getFloat ( "longitude") );
        stop.setLatitude ( resultSet.getFloat ( "latitude") );
        return stop;
    }
    public List<Stop> findStopWithBusLineById(long id) throws SQLException{
        List<Stop> stopsWithBusLine = new ArrayList<> (  );
        String sql="SELECT * FROM stop as s INNER JOIN stopBusLine as sB ON sB.stop_id = s.id WHERE sB.busLine_id = ?";
        Connection connection = DatabaseConfig.getInstance ( ).getConnection ( );
        try (PreparedStatement preparedStatement = connection.prepareStatement ( sql )){
            preparedStatement.setLong ( 1, id );
            ResultSet resultSet = preparedStatement.executeQuery ( );
            while (resultSet.next ( )){
                stopsWithBusLine.add ( mapResultSetToBusLine ( resultSet ) );
            }
        }
        return stopsWithBusLine;
    }

    private BusLine mapResultSetToStop(ResultSet resultSet) throws SQLException{
        BusLine busLine = new BusLine ();
        busLine.setId ( resultSet.getLong ( "id") );
        busLine.setLinenumber ( resultSet.getString ( "lineNumber" ) );
        return busLine;
    }

    public List<BusLine> finBusLineWithStopById(long id) throws SQLException{
        List<BusLine> BusLineWithStop = new ArrayList<> ();
        String sql = "SELECT bl.* FROM busLine as bl INNER JOIN stopBusLine as sb ON sb.busLine_id = bl.id WHERE sb.stop_id = ?";
        Connection connection = DatabaseConfig.getInstance ( ).getConnection ( );
        try(PreparedStatement preparedStatement = connection.prepareStatement ( sql )) {
            preparedStatement.setLong ( 1, id );
            ResultSet resultSet = preparedStatement.executeQuery ( );
            while (resultSet.next ( )){
                BusLineWithStop.add ( mapResultSetToStop ( resultSet ) );
            }
        }
        return BusLineWithStop;
    }
}
