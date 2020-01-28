package io.bitjoker.weatherforecast.models.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@JsonNaming
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WeatherData {

    @JsonProperty("wind_speed")
    private double windSpeed; //wind_spd
    @JsonProperty("average_temperature")
    private double averageTemperature; //temp
    @JsonProperty("max_temperature")
    private double maxTemperature; //max_temp
    @JsonProperty("min_temperature")
    private double minTemperature; //min_temp
    @JsonProperty("high_temperature")
    private double highTemperature; //high_temp
    @JsonProperty("low_temperature")
    private double lowTemperature; //low_temp
    @JsonProperty("max_feel_temperature")
    private double maxFeelTemperature; //app_max_temp
    @JsonProperty("min_feel_temperature")
    private double minFeelTemperature; //app_min_temp
    @JsonProperty("rain_probability")
    private double rainProbability; //pop
    @JsonProperty("rain_precipitation")
    private double rainPrecipitation; //precip
    @JsonProperty("snow_accumulated")
    private double snowAccumulated; //snow
    @JsonProperty("snow_depth")
    private double snowDepth; //snow_depth
    @JsonProperty("average_atmospheric_pressure")
    private double averageAtmosphericPressure; //pres
    @JsonProperty("average_sea_atmospheric_pressure")
    private double averageSeaAtmosphericPressure; //slp
    @JsonProperty("average_relative_humidity")
    private double averageRelativeHumidity; //rh
    @JsonProperty("weather_description")
    private String weatherDescription; //weather.description
    @JsonProperty("part_of_day")
    private String partOfDay; //pod
    @JsonProperty("average_total_cloud_coverage")
    private double averageTotalCloudCoverage; //clouds
    private double visibility; //vis
    @JsonProperty("uv_radiation")
    private double uvRadiation; //uv
    @JsonProperty("average_ozone")
    private double averageOzone; //ozone
    @JsonProperty("moon_phase")
    private double moonPhase; //moon_phase
    @JsonProperty("moonrise_timestamp")
    private long moonriseTimestamp; //moonrise_ts
    @JsonProperty("moonset_timestamp")
    private long moonsetTimestamp; //moonset_ts
    @JsonProperty("sunrise_timestamp")
    private long sunriseTimestamp; //sunrise_ts
    @JsonProperty("sunset_timestamp")
    private long sunsetTimestamp; //sunset_ts

}
