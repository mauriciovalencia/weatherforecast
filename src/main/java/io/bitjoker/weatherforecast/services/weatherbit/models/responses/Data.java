
package io.bitjoker.weatherforecast.services.weatherbit.models.responses;

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
public class Data {

    @JsonProperty("app_max_temp")
    private double appMaxTemp;
    @JsonProperty("app_min_temp")
    private double appMinTemp;
    private long clouds;
    @JsonProperty("clouds_hi")
    private long cloudsHi;
    @JsonProperty("clouds_low")
    private long cloudsLow;
    @JsonProperty("clouds_mid")
    private long cloudsMid;
    private String datetime;
    private double dewpt;
    @JsonProperty("high_temp")
    private double highTemp;
    @JsonProperty("low_temp")
    private double lowTemp;
    @JsonProperty("max_dhi")
    private long maxDhi;
    @JsonProperty("max_temp")
    private double maxTemp;
    @JsonProperty("min_temp")
    private double minTemp;
    @JsonProperty("moon_phase")
    private double moonPhase;
    @JsonProperty("moonrise_ts")
    private long moonriseTs;
    @JsonProperty("moonset_ts")
    private long moonsetTs;
    private double ozone;
    private long pop;
    private long precip;
    private double pres;
    private double rh;
    private double slp;
    private long snow;
    @JsonProperty("snow_depth")
    private long snowDepth;
    @JsonProperty("sunrise_ts")
    private long sunriseTs;
    @JsonProperty("sunset_ts")
    private long sunsetTs;
    private double temp;
    private long ts;
    private double uv;
    @JsonProperty("valid_date")
    private String validDate;
    private double vis;
    private io.bitjoker.weatherforecast.services.weatherbit.models.responses.Weather weather;
    @JsonProperty("wind_cdir")
    private String windCdir;
    @JsonProperty("wind_cdir_full")
    private String windCdirFull;
    @JsonProperty("wind_dir")
    private long windDir;
    @JsonProperty("wind_gust_spd")
    private double windGustSpd;
    @JsonProperty("wind_spd")
    private double windSpd;
    private String pod;


}
