package io.bitjoker.weatherforecast.models.requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import io.bitjoker.weatherforecast.models.City;
import io.bitjoker.weatherforecast.models.Country;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@JsonNaming
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WeatherRequest {

    @JsonProperty
    private String country;
    @JsonProperty
    private String city;

}
