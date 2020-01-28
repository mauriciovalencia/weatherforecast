package io.bitjoker.weatherforecast.controllers;

import io.bitjoker.weatherforecast.models.City;
import io.bitjoker.weatherforecast.models.Country;
import io.bitjoker.weatherforecast.models.requests.WeatherRequest;
import io.bitjoker.weatherforecast.models.responses.WeatherData;
import io.bitjoker.weatherforecast.models.responses.WeatherResponse;
import io.bitjoker.weatherforecast.services.weatherbit.WeatherbitServiceImpl;
import io.bitjoker.weatherforecast.services.weatherbit.exceptions.EmptyParamException;
import io.bitjoker.weatherforecast.services.weatherbit.exceptions.WeatherbitException;
import io.bitjoker.weatherforecast.services.weatherbit.models.responses.WeatherbitResponse;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class WeatherRestController {

    private static Logger log = LoggerFactory.getLogger(WeatherRestController.class);

    @Getter
    private WeatherbitServiceImpl weatherbitService;

    @Autowired
    public void setWeatherbitService (WeatherbitServiceImpl weatherbitService){
        this.weatherbitService = weatherbitService;
    }


    @GetMapping("/v1/weather/forecast")
    public ResponseEntity<WeatherResponse> getForecastV1 (WeatherRequest request) {

        try {

            // =============== Validations =============

            // is request null or empty
            if(request == null){
                throw new EmptyParamException("request parameters");
            }

            // is country and countryName null or empty
            if(null == request.getCountry() || request.getCountry().isEmpty()) {
                throw new EmptyParamException("country");
            }

            // is city and cityName null or empty
            if(null == request.getCity() || request.getCity().isEmpty()){
                throw new EmptyParamException("city");
            }

            // if all is god, set country and city
            Country country = new Country();
            country.setName(request.getCountry());
            City city = new City();
            city.setName(request.getCity());


            WeatherbitResponse weatherbitResponse = weatherbitService
                    .getDailyForecastByCountryAndCityAndDaysLimit(country,city,7);

            WeatherResponse weatherResponse = new WeatherResponse();
            weatherResponse.setCountryCode(weatherbitResponse.getCountryCode());
            weatherResponse.setCountryName(country.getName());
            weatherResponse.setCityName(city.getName());
            weatherResponse.setLatitude(weatherbitResponse.getLat());
            weatherResponse.setLongitude(weatherbitResponse.getLon());
            weatherResponse.setTimezone(weatherbitResponse.getTimezone());

            List<WeatherData> weatherDataListToSet = new ArrayList<>();
            weatherbitResponse.getData().forEach(data -> {
                WeatherData weatherDataToSet = new WeatherData();

                weatherDataToSet.setWindSpeed(data.getWindSpd()); //wind_spd
                weatherDataToSet.setAverageTemperature(data.getTemp()); //temp
                weatherDataToSet.setMaxTemperature(data.getMaxTemp()); //max_temp
                weatherDataToSet.setMinTemperature(data.getMinTemp()); //min_temp
                weatherDataToSet.setHighTemperature(data.getHighTemp()); //high_temp
                weatherDataToSet.setLowTemperature(data.getLowTemp()); //low_temp
                weatherDataToSet.setMaxFeelTemperature(data.getAppMaxTemp()); //app_max_temp
                weatherDataToSet.setMinFeelTemperature(data.getAppMinTemp()); //app_min_temp
                weatherDataToSet.setRainProbability(data.getPop()); //pop
                weatherDataToSet.setRainPrecipitation(data.getPrecip()); //precip
                weatherDataToSet.setSnowAccumulated(data.getSnow()); //snow
                weatherDataToSet.setSnowDepth(data.getSnowDepth()); //snow_depth
                weatherDataToSet.setAverageAtmosphericPressure(data.getPres()); //pres
                weatherDataToSet.setAverageSeaAtmosphericPressure(data.getSlp()); //slp
                weatherDataToSet.setAverageRelativeHumidity(data.getRh()); //rh
                weatherDataToSet.setWeatherDescription(data.getWeather().getDescription()); //weather.description
                weatherDataToSet.setPartOfDay(data.getPod()); //pod
                weatherDataToSet.setAverageTotalCloudCoverage(data.getClouds()); //clouds
                weatherDataToSet.setVisibility(data.getVis()); //vis
                weatherDataToSet.setUvRadiation(data.getUv()); //uv
                weatherDataToSet.setAverageOzone(data.getOzone()); //ozone
                weatherDataToSet.setMoonPhase(data.getMoonPhase()); //moon_phase
                weatherDataToSet.setMoonriseTimestamp(data.getMoonriseTs()); //moonrise_ts
                weatherDataToSet.setMoonsetTimestamp(data.getMoonsetTs()); //moonset_ts
                weatherDataToSet.setSunriseTimestamp(data.getSunriseTs()); //sunrise_ts
                weatherDataToSet.setSunsetTimestamp(data.getSunsetTs()); //sunset_ts

                weatherDataListToSet.add(weatherDataToSet);
            });
            weatherResponse.setData(weatherDataListToSet);

            return new ResponseEntity<>(weatherResponse, HttpStatus.OK);
        }catch (WeatherbitException ex){
            throw new WeatherbitException(ex.getMessage(),ex.getCode());
        }

    }


}
