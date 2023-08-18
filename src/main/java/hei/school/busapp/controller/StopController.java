package hei.school.busapp.controller;

import hei.school.busapp.entity.Stop;
import hei.school.busapp.service.StopServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/stops")
public class StopController {
    private final StopServiceImp stopServiceImp;

    @Autowired
    public StopController(StopServiceImp stopServiceImp){
        this.stopServiceImp = stopServiceImp;
    }

    @GetMapping("/")
    public List<Stop> getAllStops() {
        return stopServiceImp
                .getAllStops ();
    }

    @GetMapping("/{id}")
    public  List<Stop> getStopsById(@PathVariable int id){
        return stopServiceImp
                .getStopsById ( id );
    }

    @PostMapping("/add")
    public String addStop(@RequestBody Stop newStop){
        boolean success = stopServiceImp.addStop ( newStop );
        if (success) {
            return "Stop added successfully";
        } else {
            return"Failed to add stop";
        }
    }

    @PutMapping("/update/put/{id}")
    public String updateStop(@PathVariable long id,@RequestBody Stop newStop){
        boolean success = stopServiceImp.updateStop ( id, newStop );
        if (success) {
            return "Stop updated successfully";
        } else {
            return"Failed to updated stop";
        }
    }

    @PatchMapping("/update/patch/{id}")
    public String patchStop(@PathVariable long id,@RequestBody Map<String, String> newStop){
        boolean success = stopServiceImp.patchStop ( id, newStop );
        if (success) {
            return "Stop updated successfully";
        } else {
            return"Failed to updated stop";
        }
    }
}
