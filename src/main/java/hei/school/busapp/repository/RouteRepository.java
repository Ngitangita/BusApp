package hei.school.busapp.repository;

import hei.school.busapp.entity.Route;

import java.util.List;

public interface RouteRepository {

    List<Route> getAllRoute();

    List<Route> getRouteById(long id);

    boolean addRoute(Route route);
    boolean updateRoute(long id, Route route);
    boolean patchRoute(long id, String newRoutename);
    boolean deleteRoute(long id);
}
