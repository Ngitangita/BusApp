package hei.school.busapp.repository;

import hei.school.busapp.connection.DatabaseConfig;
import hei.school.busapp.entity.BusLine;
import hei.school.busapp.entity.Route;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BusLineRouteRepository {
    private BusLine mapResultSetToBusLine(ResultSet resultSet) throws SQLException{
        BusLine busLine = new BusLine (  );
        busLine.setId ( resultSet.getLong ( "id") );
        busLine.setLinenumber ( resultSet.getString ( "lineNumber") );
        return busLine;
    }

    public List<BusLine> finBusLineWithRouteById(long id) throws SQLException{
        List<BusLine> BusLineWithRoute = new ArrayList<> (  );
        String sql = "SELECT bl.* FROM busline as bl INNER JOIN buslineroute as br ON br.busline_id = bl.id WHERE br.route_id = ?";
        Connection connection = DatabaseConfig.getInstance ().getConnection ();
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setLong ( 1, id );
            ResultSet resultSet = preparedStatement.executeQuery ( );
            while (resultSet.next ()){
                BusLineWithRoute.add(mapResultSetToBusLine ( resultSet ));
            }
        }
        return BusLineWithRoute;
    }

    private Route mapResultSetToRoute(ResultSet resultSet) throws SQLException {
        Route route = new Route (  );
        route.setId ( resultSet.getLong ( "id" ) );
        route.setRouteName ( resultSet.getString ( "routeName" ) );
        return route;
    }
    public List<Route> findRouteWithBusLineById(long id) throws SQLException{
        List<Route> RouteWithBusLine = new ArrayList<> ();
        String sql = "SELECT r.* FROM route as r INNER JOIN buslineroute as br ON br.route_id = r.id WHERE br.busline_id = ?";
        Connection connection = DatabaseConfig.getInstance ( ).getConnection ( );
        try(PreparedStatement preparedStatement = connection.prepareStatement ( sql )){
            preparedStatement.setLong ( 1, id );
            ResultSet resultSet = preparedStatement.executeQuery ();
            while (resultSet.next ()){
                RouteWithBusLine.add (   mapResultSetToRoute( resultSet ));
            }
        }
        return RouteWithBusLine;
    }
}
