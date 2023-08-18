package hei.school.busapp.service;

import hei.school.busapp.entity.Stop;
import hei.school.busapp.repository.StopRepositoryImp;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Service
public class StopServiceImp implements StopService {

    private StopRepositoryImp stopRepositoryImp;

    @Autowired
    public StopServiceImp(StopRepositoryImp stopRepositoryImp){
        this.stopRepositoryImp = stopRepositoryImp;
    }

    @Override
    public List<Stop> getAllStops(){
        return stopRepositoryImp
                .getAllStops ();
    }

    @Override
    public List<Stop> getStopsById(long id){
        return stopRepositoryImp
                .getStopsById ( id );
    }

    @Override
    public boolean addStop(Stop stop){
            try {
                stopRepositoryImp.addStop(stop);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
    }

    @Override
    public boolean updateStop(long id, Stop stop){
        try {
            if (!stopRepositoryImp.getStopsById (id ).isEmpty ()){
                stopRepositoryImp.updateStop (id, stop);
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean patchStop(long id, Map<String, String> newStopname){
        try {
           if (! stopRepositoryImp.getStopsById ( id ).isEmpty ()){
               stopRepositoryImp.patchStop( id, newStopname.get ( "stopname"));
               return true;
           }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
