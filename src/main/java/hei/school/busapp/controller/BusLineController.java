package hei.school.busapp.controller;

import hei.school.busapp.dto.BusLineDTO;
import hei.school.busapp.entity.BusLine;
import hei.school.busapp.service.BusLineServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/busLine")
public class BusLineController {
    private final BusLineServiceImp busLineServiceImp;

    @Autowired
    public BusLineController(BusLineServiceImp busLineServiceImp){this.busLineServiceImp = busLineServiceImp;}

    @GetMapping("/busLineStopRoute")
    public List<BusLine> getAllBusLineStopRoute(){
        return busLineServiceImp
                .getAllBusLineStopRoute ();
    }

    @GetMapping("/allBusLine")
    public List<BusLineDTO> getAllBusLine(){
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
            return "Failed to add busLine";
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
