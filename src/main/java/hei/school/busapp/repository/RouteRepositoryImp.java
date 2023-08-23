package hei.school.busapp.repository;


import hei.school.busapp.connection.DatabaseConfig;
import hei.school.busapp.entity.Route;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Repository
public class RouteRepositoryImp implements RouteRepository{
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    private Connection connection;
    private StopRouteRepository stopRouteRepository;
    private BusLineRouteRepository repository;

    public RouteRepositoryImp(BusLineRouteRepository repository, StopRouteRepository stopRouteRepository){
        this.repository = repository;
        this.stopRouteRepository = stopRouteRepository;
    }

    @Override
    public List<Route> getAllRoute(){
        List<Route> route = new ArrayList<> ();
        try {
            connection = DatabaseConfig.getInstance ( ).getConnection ( );
            preparedStatement = connection.prepareStatement ( "SELECT * FROM route" );
            resultSet = preparedStatement.executeQuery ();
            while (resultSet.next()) {
                route.add (
                        new Route (
                                resultSet.getLong ( "id" ),
                                resultSet.getString ( "routeName" ),
                                stopRouteRepository.findStopWithRouteById(resultSet.getLong ( "id" )),
                                repository.finBusLineWithRouteById ( resultSet.getLong ( "id") )
                        )
                );
            }
        } catch ( SQLException e ){
            e.printStackTrace ();
        }
        return route;
    }

    @Override
    public List<Route> getRouteById(long id){
        List<Route> routes = new ArrayList<> (  );
        try {
            connection = DatabaseConfig.getInstance ( ).getConnection ( );
            preparedStatement =connection.prepareStatement ( "SELECT * FROM route WHERE id = ?" );
            preparedStatement.setLong ( 1, id );
            resultSet = preparedStatement.executeQuery ();
            if (resultSet.next ()) {
                routes.add (
                        new Route (
                                resultSet.getLong ( "id" ),
                                resultSet.getString ( "routeName" ),
                                stopRouteRepository.findStopWithRouteById(resultSet.getLong ( "id" )),
                                repository.finBusLineWithRouteById ( resultSet.getLong ( "id") )
                        )
                );
            }
        } catch ( SQLException e ){
            e.printStackTrace ();
        }
        return routes;
    }

    @Override
    public boolean addRoute(Route route){
        try {
            connection = DatabaseConfig.getInstance ( ).getConnection ( );
            preparedStatement = connection.prepareStatement (
                    "INSERT INTO route(routeName) " +
                            "VALUES (?);"
            );
            preparedStatement.setString ( 1, route.getRouteName ());
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
    public boolean updateRoute(long id, Route route){
        try{
            connection = DatabaseConfig.getInstance ( ).getConnection ( );
            preparedStatement =connection.prepareStatement (
                    "UPDATE route set routeName=? where id = ?"
            );
            preparedStatement.setString ( 1, route.getRouteName ( ) );
            preparedStatement.setLong ( 2, id);
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
    public boolean deleteRoute(long id){
        try {
            connection = DatabaseConfig.getInstance ( ).getConnection ( );
            preparedStatement = connection.prepareStatement (
                    "DELETE FROM route WHERE id = ?"
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
