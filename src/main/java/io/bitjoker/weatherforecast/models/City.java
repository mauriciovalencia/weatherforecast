package io.bitjoker.weatherforecast.models;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@JsonNaming
@JsonInclude(JsonInclude.Include.NON_NULL)
public class City {

    private Long id;
    private Long countryId;
    private String name;

    /*public static City entityToCity(CityEntitiy ce){
        City c = new City();
        c.setId(ce.getId());
        c.setCountryId(ce.getCountryId());
        c.setName(ce.getName());
        return c;
    }*/
}
