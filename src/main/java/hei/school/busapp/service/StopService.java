package hei.school.busapp.service;

import hei.school.busapp.entity.Stop;

import java.util.List;

public interface StopService {

    List<Stop> getAllStopBusLineRoute();

    List<Stop> getStopById(long id);

    boolean addStop(Stop stop);

    boolean updateStop(long id, Stop stop);

    boolean deleteStop(long id);
}
