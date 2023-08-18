package hei.school.busapp.repository;

import hei.school.busapp.entity.Stop;

import java.util.List;

public interface StopRepository {
    List<Stop> getAllStops();
    List<Stop> getStopsById(long id);
    boolean addStop(Stop stop);
    boolean updateStop(long id, Stop stop);
    boolean patchStop(long id,  String newStopname);
}
