package hei.school.busapp.repository;

import hei.school.busapp.entity.BusLine;

import java.util.List;

public interface BusLineRepository {
    List<BusLine> getAllBusLine();

    List<BusLine> getBusLineById(long id);

    void addBusLine(BusLine busLine);

    void updateBusLine(long id, BusLine busLine);

    void deleteBusLine(long id);
}
