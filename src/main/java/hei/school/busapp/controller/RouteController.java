package hei.school.busapp.controller;

import hei.school.busapp.entity.Route;
import hei.school.busapp.service.RouteServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/route")
public class RouteController {
    private final RouteServiceImp routeServiceImp;

    @Autowired
    public RouteController(RouteServiceImp routeServiceImp){
        this.routeServiceImp = routeServiceImp;
    }

    @GetMapping("/")
    public List<Route> getallRoute() {
        return routeServiceImp
                .getAllRoute ();
    }

    @GetMapping("/{id}")
    public  List<Route> getRouteById(@PathVariable int id){
        return routeServiceImp
                .getRouteById ( id );
    }

    @PostMapping("/add")
    public String addRoute(@RequestBody Route newRoute){
        boolean success = routeServiceImp.addRoute ( newRoute );
        if (success) {
            return "Route added successfully";
        } else {
            return"Failed to add route";
        }
    }

    @PutMapping("/update/put/{id}")
    public String updateRoute(@PathVariable long id,@RequestBody Route newRoute){
        boolean success = routeServiceImp.updateRoute ( id, newRoute );
        if (success) {
            return "Route updated successfully";
        } else {
            return"Failed to updated route";
        }
    }

    @PatchMapping("/update/patch/{id}")
    public String patchRoute(@PathVariable long id,@RequestBody Map<String, String> newRoute){
        boolean success = routeServiceImp.patchRoute ( id, newRoute );
        if (success) {
            return "Route updated successfully";
        } else {
            return"Failed to updated route";
        }
    }

    @DeleteMapping("/delete/{id}")
    public String deleteRoute(@PathVariable long id){
        boolean success = routeServiceImp.deletRoute ( id );
        if (success) {
            return "Route delete successfully";
        } else {
            return"Failed to delete Route";
        }
    }
}
