package hei.school.busapp.service;

import hei.school.busapp.entity.Route;

import java.util.List;
import java.util.Map;

public interface RouteService {
    List<Route> getAllRoute();
    List<Route> getRouteById(long id);
    boolean addRoute(Route route);
    boolean updateRoute(long id, Route route);
    boolean patchRoute(long id, Map<String, String> newRoutename);
    boolean deletRoute(long id);

}
