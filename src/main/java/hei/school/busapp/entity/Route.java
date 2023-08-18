package hei.school.busapp.entity;

import lombok.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class Route {
    private long id;
    private String routeName;
}
