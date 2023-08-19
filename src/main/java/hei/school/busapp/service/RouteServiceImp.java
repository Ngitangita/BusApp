package hei.school.busapp.service;

import hei.school.busapp.entity.Route;
import hei.school.busapp.repository.RouteRepositoryImp;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Service
public class RouteServiceImp implements RouteService {

    private RouteRepositoryImp routeRepositoryImp;

    @Autowired
    public RouteServiceImp(RouteRepositoryImp routeRepositoryImp){
        this.routeRepositoryImp = routeRepositoryImp;
    }

    @Override
    public List<Route> getAllRoute(){
        return routeRepositoryImp
                .getAllRoute();
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
    public boolean patchRoute(long id, Map<String, String> newRoutename){
        try {
            if (! routeRepositoryImp.getRouteById ( id ).isEmpty ()){
                routeRepositoryImp.patchRoute( id, newRoutename.get ( "routename"));
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deletRoute(long id){
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
