package hei.school.busapp.service;

import hei.school.busapp.entity.Route;

import java.util.List;

public interface RouteService {
    List<Route> getAllRouteStopBusLine();

    List<Route> getRouteById(long id);
    boolean addRoute(Route route);
    boolean updateRoute(long id, Route route);
    boolean deleteRoute(long id);

}
