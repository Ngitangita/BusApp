package hei.school.busapp.controller;


import hei.school.busapp.entity.Stop;
import hei.school.busapp.service.StopServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/stop")
public class StopController {
    private final StopServiceImp stopServiceImp;

    @Autowired
    public StopController(StopServiceImp stopServiceImp){this.stopServiceImp = stopServiceImp;}

    @GetMapping("/")
    public List<Stop> getAllStop(){
        return stopServiceImp
                .getAllStop ();
    }

    @GetMapping("/{id}")
    public List<Stop> getStopById(@PathVariable int id){
        return stopServiceImp
                .getStopById ( id );
    }

    @PostMapping("/add")
    public String addStop(@RequestBody Stop newStop){
        boolean success = stopServiceImp.addStop ( newStop );
        if (success){
            return "Stop added successfully";
        }else {
            return "Failed to add route";
        }
    }

    @PutMapping("/update/put/{id}")
    public String updateStop(@PathVariable long id, @RequestBody Stop newStop){
        boolean success = stopServiceImp.updateStop ( id, newStop );
        if (success){
            return "Stop updated successfylly";
        }else {
            return "Failed to epdated stop";
        }
    }

    @PatchMapping("/update/patch/{id}")
    public String patchStop(@PathVariable long id, @RequestBody Map<String, String> newStop){
        boolean success = stopServiceImp.patchStop ( id, newStop);
        if (success){
            return "Stop updated successfuly";
        }else {
            return "Failed updated Stop";
        }
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStop(@PathVariable long id){
        boolean success = stopServiceImp.deleteStop ( id );
        if (success){
            return "Stop deleted successfully";
        }else {
            return "Failed to delete stope";
        }
    }
}
