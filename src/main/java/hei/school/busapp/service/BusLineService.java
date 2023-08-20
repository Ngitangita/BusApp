package hei.school.busapp.service;

import hei.school.busapp.entity.BusLine;

import java.util.List;
import java.util.Map;

public interface BusLineService {

    List<BusLine> getAllBusLine();

    List<BusLine> getBusLineById(long id);

    boolean addBusLine(BusLine busLine);

    boolean updateBusLine(long id, BusLine busLine);

    boolean patchBusLine(long id, Map<String, String> newlinename);

    boolean deleteBusLine(long id);
}
