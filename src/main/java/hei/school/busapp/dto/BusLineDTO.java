package hei.school.busapp.dto;

import hei.school.busapp.entity.BusLine;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

@Value
@AllArgsConstructor
@Data
public class BusLineDTO {
    long id;
    String linenumber;

    public static BusLineDTO busLineFrom(BusLine bl){
        return new BusLineDTO (
               bl.getId (),
               bl.getLinenumber ()
        );
    }
}
