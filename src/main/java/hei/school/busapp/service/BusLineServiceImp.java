package hei.school.busapp.service;

import hei.school.busapp.entity.BusLine;
import hei.school.busapp.repository.BusLineRepositoryImp;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Service
public class BusLineServiceImp implements BusLineService{
    private BusLineRepositoryImp busLineRepositoryImp;

    @Autowired
    public BusLineServiceImp(BusLineRepositoryImp busLineRepositoryImp){this.busLineRepositoryImp = busLineRepositoryImp;}

    @Override
    public List<BusLine> getAllBusLine(){
        return busLineRepositoryImp
                .getAllBusLine ();
    }

    @Override
    public List<BusLine> getBusLineById(long id){
        return busLineRepositoryImp
                .getBusLineById ( id );
    }

    @Override
    public boolean addBusLine(BusLine busLine){
        try {
            busLineRepositoryImp.addBusLine ( busLine );
            return true;
        } catch ( Exception e ) {
            throw new RuntimeException ( e );
        }
    }

    @Override
    public boolean updateBusLine(long id, BusLine busLine){
        try {
            if (!busLineRepositoryImp.getBusLineById ( id ).isEmpty ()){
                busLineRepositoryImp.updateBusLine ( id, busLine );
                return true;
            }
            return false;
        } catch ( Exception e ) {
            throw new RuntimeException ( e );
        }
    }

    @Override
    public boolean patchBusLine(long id, Map<String, String> newlinename){
        try {
            if (!busLineRepositoryImp.getBusLineById ( id ).isEmpty ()){
                busLineRepositoryImp.patchBusLine ( id, newlinename.get ( "linename" ) );
                return true;
            }
            return false;
        } catch ( Exception e ) {
            throw new RuntimeException ( e );
        }
    }

    @Override
    public boolean deleteBusLine(long id){
        try {
            if (!busLineRepositoryImp.getBusLineById ( id ).isEmpty ()){
                busLineRepositoryImp.deleteBusLine ( id );
                return true;
            }
            return false;
        } catch ( Exception e ) {
            throw new RuntimeException ( e );
        }
    }

}
