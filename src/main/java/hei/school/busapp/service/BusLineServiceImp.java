package hei.school.busapp.service;

import hei.school.busapp.dto.BusLineDTO;
import hei.school.busapp.entity.BusLine;
import hei.school.busapp.repository.BusLineRepositoryImp;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@Service
public class BusLineServiceImp implements BusLineService{
    private BusLineRepositoryImp busLineRepositoryImp;

    @Autowired
    public BusLineServiceImp(BusLineRepositoryImp busLineRepositoryImp){this.busLineRepositoryImp = busLineRepositoryImp;}

    @Override
    public List<BusLine> getAllBusLineStopRoute(){
        return busLineRepositoryImp
                .getAllBusLine ();
    }

    public List<BusLineDTO> getAllBusLine(){
        return busLineRepositoryImp
                .getAllBusLine ().stream ()
                .map ( BusLineDTO::busLineFrom ).collect( Collectors.toList());
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
