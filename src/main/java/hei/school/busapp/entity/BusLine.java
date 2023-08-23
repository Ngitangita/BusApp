package hei.school.busapp.entity;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class BusLine {
    private long id;
    private String linenumber;
    private List<Route> routes;
    private List<Stop> stops;
}

