package hei.school.busapp.repository;

import hei.school.busapp.connection.DatabaseConfig;
import hei.school.busapp.entity.Route;
import hei.school.busapp.entity.Stop;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StopRouteRepository {

    private Route mapResultSetToRoute(ResultSet resultSet) throws SQLException {
        Route route = new Route (  );
        route.setRouteName ( resultSet.getString ( "routeName" ) );
        route.setId ( resultSet.getLong ( "id" ) );
        return route;
    }
    public List<Route> findRouteWithStopById(long id) throws SQLException{
        List<Route> routeWithStops = new ArrayList<> ();
        String sql = "SELECT * FROM route as r INNER JOIN stoproute as sr ON sr.route_id = r.id WHERE sr.stop_id = ?";
        Connection connection = DatabaseConfig.getInstance ( ).getConnection ( );
        try(PreparedStatement preparedStatement = connection.prepareStatement ( sql )){
            preparedStatement.setLong ( 1, id );
            ResultSet resultSet = preparedStatement.executeQuery ();
            while (resultSet.next ()){
                routeWithStops.add (   mapResultSetToRoute( resultSet ));
            }
        }
        return routeWithStops;
    }

    private Stop mapResultSetToStop(ResultSet resultSet) throws SQLException{
        Stop stop = new Stop ();
        stop.setId ( resultSet.getLong ( "id" ) );
        stop.setStopName ( resultSet.getString ( "stopName") );
        stop.setLongitude ( resultSet.getFloat ( "longitude") );
        stop.setLatitude ( resultSet.getFloat ( "latitude") );
        return stop;
    }

    public List<Stop> findStopWithRouteById(long id) throws SQLException{
        List<Stop> stopsWithRoute = new ArrayList<> ();
        String sql = "SELECT * FROM stop as s INNER JOIN stoproute as sr ON sr.stop_id = s.id WHERE sr.route_id = ?";
        Connection connection = DatabaseConfig.getInstance ().getConnection ();
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setLong ( 1, id );
            ResultSet resultSet = preparedStatement.executeQuery ( );
            while (resultSet.next ()){
                stopsWithRoute.add(mapResultSetToStop ( resultSet ));
            }
        }
        return stopsWithRoute;
    }
}
