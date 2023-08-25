package hei.school.busapp.dto;


import hei.school.busapp.entity.Stop;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

@Value
@AllArgsConstructor
@Getter
@Setter
public class StopDTO {
    long id;
    String stopName;

    public static StopDTO stopFrom(Stop stop){
        return new StopDTO ( stop.getId ( ), stop.getStopName ());
    }
}
