
package io.bitjoker.weatherforecast.services.weatherbit.models.responses;

import com.fasterxml.jackson.annotation.JsonProperty;


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
    private Object maxDhi;
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
    private long rh;
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
    private Weather weather;
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

    public double getAppMaxTemp() {
        return appMaxTemp;
    }

    public void setAppMaxTemp(double appMaxTemp) {
        this.appMaxTemp = appMaxTemp;
    }

    public double getAppMinTemp() {
        return appMinTemp;
    }

    public void setAppMinTemp(double appMinTemp) {
        this.appMinTemp = appMinTemp;
    }

    public long getClouds() {
        return clouds;
    }

    public void setClouds(long clouds) {
        this.clouds = clouds;
    }

    public long getCloudsHi() {
        return cloudsHi;
    }

    public void setCloudsHi(long cloudsHi) {
        this.cloudsHi = cloudsHi;
    }

    public long getCloudsLow() {
        return cloudsLow;
    }

    public void setCloudsLow(long cloudsLow) {
        this.cloudsLow = cloudsLow;
    }

    public long getCloudsMid() {
        return cloudsMid;
    }

    public void setCloudsMid(long cloudsMid) {
        this.cloudsMid = cloudsMid;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public double getDewpt() {
        return dewpt;
    }

    public void setDewpt(double dewpt) {
        this.dewpt = dewpt;
    }

    public double getHighTemp() {
        return highTemp;
    }

    public void setHighTemp(double highTemp) {
        this.highTemp = highTemp;
    }

    public double getLowTemp() {
        return lowTemp;
    }

    public void setLowTemp(double lowTemp) {
        this.lowTemp = lowTemp;
    }

    public Object getMaxDhi() {
        return maxDhi;
    }

    public void setMaxDhi(Object maxDhi) {
        this.maxDhi = maxDhi;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public double getMoonPhase() {
        return moonPhase;
    }

    public void setMoonPhase(double moonPhase) {
        this.moonPhase = moonPhase;
    }

    public long getMoonriseTs() {
        return moonriseTs;
    }

    public void setMoonriseTs(long moonriseTs) {
        this.moonriseTs = moonriseTs;
    }

    public long getMoonsetTs() {
        return moonsetTs;
    }

    public void setMoonsetTs(long moonsetTs) {
        this.moonsetTs = moonsetTs;
    }

    public double getOzone() {
        return ozone;
    }

    public void setOzone(double ozone) {
        this.ozone = ozone;
    }

    public long getPop() {
        return pop;
    }

    public void setPop(long pop) {
        this.pop = pop;
    }

    public long getPrecip() {
        return precip;
    }

    public void setPrecip(long precip) {
        this.precip = precip;
    }

    public double getPres() {
        return pres;
    }

    public void setPres(double pres) {
        this.pres = pres;
    }

    public long getRh() {
        return rh;
    }

    public void setRh(long rh) {
        this.rh = rh;
    }

    public double getSlp() {
        return slp;
    }

    public void setSlp(double slp) {
        this.slp = slp;
    }

    public long getSnow() {
        return snow;
    }

    public void setSnow(long snow) {
        this.snow = snow;
    }

    public long getSnowDepth() {
        return snowDepth;
    }

    public void setSnowDepth(long snowDepth) {
        this.snowDepth = snowDepth;
    }

    public long getSunriseTs() {
        return sunriseTs;
    }

    public void setSunriseTs(long sunriseTs) {
        this.sunriseTs = sunriseTs;
    }

    public long getSunsetTs() {
        return sunsetTs;
    }

    public void setSunsetTs(long sunsetTs) {
        this.sunsetTs = sunsetTs;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public long getTs() {
        return ts;
    }

    public void setTs(long ts) {
        this.ts = ts;
    }

    public double getUv() {
        return uv;
    }

    public void setUv(double uv) {
        this.uv = uv;
    }

    public String getValidDate() {
        return validDate;
    }

    public void setValidDate(String validDate) {
        this.validDate = validDate;
    }

    public double getVis() {
        return vis;
    }

    public void setVis(double vis) {
        this.vis = vis;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String getWindCdir() {
        return windCdir;
    }

    public void setWindCdir(String windCdir) {
        this.windCdir = windCdir;
    }

    public String getWindCdirFull() {
        return windCdirFull;
    }

    public void setWindCdirFull(String windCdirFull) {
        this.windCdirFull = windCdirFull;
    }

    public long getWindDir() {
        return windDir;
    }

    public void setWindDir(long windDir) {
        this.windDir = windDir;
    }

    public double getWindGustSpd() {
        return windGustSpd;
    }

    public void setWindGustSpd(double windGustSpd) {
        this.windGustSpd = windGustSpd;
    }

    public double getWindSpd() {
        return windSpd;
    }

    public void setWindSpd(double windSpd) {
        this.windSpd = windSpd;
    }

}
