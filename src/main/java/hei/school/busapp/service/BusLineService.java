package hei.school.busapp.service;

import hei.school.busapp.entity.BusLine;

import java.util.List;

public interface BusLineService {


    List<BusLine> getAllBusLineStopRoute();

    List<BusLine> getBusLineById(long id);

    boolean addBusLine(BusLine busLine);

    boolean updateBusLine(long id, BusLine busLine);

    boolean deleteBusLine(long id);
}
