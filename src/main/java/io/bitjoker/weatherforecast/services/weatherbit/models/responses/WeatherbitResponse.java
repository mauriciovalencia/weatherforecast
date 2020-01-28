
package io.bitjoker.weatherforecast.services.weatherbit.models.responses;

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
public class WeatherbitResponse {

    @JsonProperty("city_name")
    private String cityName;
    @JsonProperty("country_code")
    private String countryCode;
    private List<Data> data;
    private String lat;
    private String lon;
    @JsonProperty("state_code")
    private String stateCode;
    private String timezone;

}
