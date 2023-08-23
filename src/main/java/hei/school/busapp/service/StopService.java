package hei.school.busapp.service;

import hei.school.busapp.entity.Stop;

import java.util.List;
import java.util.Map;

public interface StopService {
    List<Stop> getAllStop();

    List<Stop> getStopById(long id);

    boolean addStop(Stop stop);

    boolean updateStop(long id, Stop stop);

    boolean deleteStop(long id);
}
