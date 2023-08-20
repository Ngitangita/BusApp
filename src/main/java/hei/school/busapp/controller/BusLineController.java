package hei.school.busapp.controller;

import hei.school.busapp.entity.BusLine;
import hei.school.busapp.service.BusLineServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/busline")
public class BusLineController {
    private final BusLineServiceImp busLineServiceImp;

    @Autowired
    public BusLineController(BusLineServiceImp busLineServiceImp){this.busLineServiceImp = busLineServiceImp;}

    @GetMapping("/")
    public List<BusLine> getAllBusLine(){
        return busLineServiceImp
                .getAllBusLine ();
    }

    @GetMapping("/{id}")
    public List<BusLine> getBusLineById(@PathVariable int id){
        return busLineServiceImp
                .getBusLineById ( id );
    }

    @PostMapping("/add")
    public String addBusLine(@RequestBody BusLine newBusLine){
        boolean success = busLineServiceImp.addBusLine ( newBusLine);
        if (success){
            return "BusLine added successfully";
        }else {
           return  "Failed to add BusLine";
        }
    }

    @PutMapping("/update/put/{id}")
    public String updateBusLine(@PathVariable long id, @RequestBody BusLine newBusLine){
        boolean success = busLineServiceImp.updateBusLine ( id, newBusLine);
        if (success){
            return "BusLine updated successfully";
        }else {
            return "Failed to updated BusLine";
        }
    }

    @PatchMapping("/update/patch/{id}")
    public String patchBusLine(@PathVariable long id, @RequestBody Map<String, String> newBusLine){
        boolean success = busLineServiceImp.patchBusLine ( id, newBusLine);
        if (success){
            return "BusLine updated successfully";
        }else {
            return "Failed to updated BusLine";
        }
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBusLine(@PathVariable long id){
        boolean success = busLineServiceImp.deleteBusLine ( id);
        if (success){
            return "BusLine deleted successfully";
        }else {
            return "Failed to deleted BusLine";
        }
    }
}
