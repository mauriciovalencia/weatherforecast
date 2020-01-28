package io.bitjoker.weatherforecast.models.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class WeatherResponse {
    //Id record
    @JsonProperty
    private Long id;

    @JsonProperty("country_code")
    private String countryCode; //country_code
    @JsonProperty("country_name")
    private String countryName;
    @JsonProperty("city_name")
    private String cityName; //city_name
    private String latitude; //lat
    private String longitude; //lon
    private String timezone; //timezone
    private List<WeatherData> data; // records

}
