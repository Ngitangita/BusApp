package hei.school.busapp.repository;

import hei.school.busapp.entity.BusLine;

import java.util.List;

public interface BusLineRepository {
    List<BusLine> getAllBusLine();

    List<BusLine> getBusLineById(long id);

    boolean addBusLine(BusLine busLine);

    boolean updateBusLine(long id, BusLine busLine);

    boolean deleteBusLine(long id);
}
