package io.bitjoker.weatherforecast.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@JsonNaming
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Country {
    private Long id;
    private List<City> cities;
    private String name;

    /* public static Country entityToCountry(CountryEntitiy ce){
        Country c = new Country();
        c.setId(ce.getId());
        c.setName(ce.getName());
        return c;
    }*/
}
