package hei.school.busapp.repository;

import hei.school.busapp.entity.Route;

import java.util.List;

public interface RouteRepository {

    List<Route> getAllRoute();

    List<Route> getRouteById(long id);

    void addRoute(Route route);
    void updateRoute(long id, Route route);
    void deleteRoute(long id);
}
