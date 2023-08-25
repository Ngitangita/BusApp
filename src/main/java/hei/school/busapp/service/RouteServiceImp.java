package hei.school.busapp.service;

import hei.school.busapp.dto.RouteDTO;
import hei.school.busapp.entity.Route;
import hei.school.busapp.repository.RouteRepositoryImp;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RouteServiceImp implements RouteService {

    private final RouteRepositoryImp routeRepositoryImp;

    public RouteServiceImp(RouteRepositoryImp routeRepositoryImp){
        this.routeRepositoryImp = routeRepositoryImp;
    }

    @Override
    public List<Route> getAllRouteStopBusLine(){
        return routeRepositoryImp
                .getAllRoute();
    }

    public List<RouteDTO> getAllRoute(){
        List<RouteDTO> result = new ArrayList<> ();
        List<Route> routes =  routeRepositoryImp.getAllRoute();
        for (Route route : routes) {
            result.add ( RouteDTO.routeFrom ( route ) );
        }
        return result;
    }

    @Override
    public List<Route> getRouteById(long id){
        return routeRepositoryImp
                .getRouteById ( id );
    }

    @Override
    public boolean addRoute(Route route){
        try {
            routeRepositoryImp.addRoute(route);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateRoute(long id, Route route){
        try {
            if (!routeRepositoryImp.getRouteById (id ).isEmpty ()){
                routeRepositoryImp.updateRoute (id, route);
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteRoute(long id){
        try {
            if (!routeRepositoryImp.getRouteById ( id ).isEmpty ()){
                routeRepositoryImp.deleteRoute ( id );
                return true;
            }
            return false;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
