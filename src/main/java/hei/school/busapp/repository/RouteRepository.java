package hei.school.busapp.repository;

import hei.school.busapp.entity.Route;

import java.util.List;

public interface RouteRepository {
    List<Route> getAllRoutes();
    List<Route> getRoutesById(long id);
    boolean addRoute(Route route);
    boolean updateRoute(long id, Route route);
    boolean patcheRoute(long id, String newRoutename);
}
