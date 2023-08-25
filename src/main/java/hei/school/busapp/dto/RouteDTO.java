package hei.school.busapp.dto;

import hei.school.busapp.entity.Route;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

@Value
@AllArgsConstructor
@Getter
@Setter
public class RouteDTO {
   long id;
   String routeName;

   public static RouteDTO routeFrom(Route route){
       return new RouteDTO ( route.getId (), route.getRouteName () );
   }
}
