package hei.school.busapp.service;


import hei.school.busapp.dto.StopDTO;
import hei.school.busapp.entity.Stop;
import hei.school.busapp.repository.StopRepositoryImp;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StopServiceImp implements StopService {
    private final StopRepositoryImp stopRepositoryImp;

    public StopServiceImp(StopRepositoryImp stopRepositoryImp){this.stopRepositoryImp = stopRepositoryImp;}

    @Override
    public List<Stop> getAllStopBusLineRoute(){
        return stopRepositoryImp
                .getAllStop ();
    }

    public List<StopDTO> getAllStop(){
        List<StopDTO> result = new ArrayList<> ();
        List<Stop> stops = stopRepositoryImp.getAllStop ();
        for (Stop stop : stops){
            result.add ( StopDTO.stopFrom ( stop ) );
        }
        return result;
    }

    @Override
    public List<Stop> getStopById(long id){
        return stopRepositoryImp
                .getStopById ( id );
    }

    @Override
    public boolean addStop(Stop stop){
        try {
            stopRepositoryImp.addStop ( stop );
            return true;
        } catch ( Exception e ) {
            throw new RuntimeException ( e );
        }
    }

    @Override
    public boolean updateStop(long id, Stop stop){
        try {
            if (!stopRepositoryImp.getStopById ( id ).isEmpty ()){
                stopRepositoryImp.updateStop ( id, stop );
                return true;
            }
            return false;
        } catch ( Exception e ) {
            throw new RuntimeException ( e );
        }
    }

    @Override
    public boolean deleteStop(long id){
        try {
            if (!stopRepositoryImp.getStopById ( id ).isEmpty ()){
                stopRepositoryImp.deleteStop ( id );
                return true;
            }
            return false;
        } catch ( Exception e ) {
            throw new RuntimeException ( e );
        }
    }
}
