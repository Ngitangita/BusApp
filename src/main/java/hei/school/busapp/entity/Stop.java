package hei.school.busapp.entity;

import lombok.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class Stop {
    private long id;
    private String stopName;
    private float longitude;
    private float latitude;
}

