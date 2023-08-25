package hei.school.busapp.repository;

import hei.school.busapp.entity.Stop;

import java.util.List;

public interface StopRepository {

    List<Stop> getAllStop();

    List<Stop> getStopById(long id);

    void addStop(Stop stop);

    void updateStop(long id, Stop stop);

    void deleteStop(long id);
}
