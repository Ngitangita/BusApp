package hei.school.busapp.service;


import hei.school.busapp.entity.Stop;
import hei.school.busapp.repository.StopRepositoryImp;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StopServiceImp implements StopService {
    private StopRepositoryImp stopRepositoryImp;

    public StopServiceImp(StopRepositoryImp stopRepositoryImp){this.stopRepositoryImp = stopRepositoryImp;}

    @Override
    public List<Stop> getAllStop(){
        return stopRepositoryImp
                .getAllStop ();
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
