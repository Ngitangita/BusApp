package hei.school.busapp.entity;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Route {
    private long id;
    private String routeName;
    private List<Stop> stops;
    private List<BusLine> busLines;

    public Route(long id, String routeName){
        this.id = id;
        this.routeName = routeName;
    }
}
