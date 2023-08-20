package hei.school.busapp.entity;

import lombok.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class BusLine {
    private long id;
    private String linenumber;
    private String linename;
}

