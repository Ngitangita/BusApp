package hei.school.busapp.entity;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Stop {
    private long id;
    private String stopName;
    private float longitude;
    private float latitude;
    private List<Route> route;
    private List<BusLine> busLines;
}

