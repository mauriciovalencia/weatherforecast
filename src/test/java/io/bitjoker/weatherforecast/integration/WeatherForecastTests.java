package io.bitjoker.weatherforecast.integration;

import io.bitjoker.weatherforecast.models.City;
import io.bitjoker.weatherforecast.models.Country;
import io.bitjoker.weatherforecast.models.requests.WeatherRequest;
import io.bitjoker.weatherforecast.models.responses.WeatherResponse;
import io.bitjoker.weatherforecast.services.weatherbit.WeatherbitServiceImpl;
import io.bitjoker.weatherforecast.services.weatherbit.exceptions.WeatherbitException;
import io.bitjoker.weatherforecast.services.weatherbit.models.responses.WeatherbitResponse;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static io.bitjoker.weatherforecast.services.weatherbit.constants.Errors.PARAM_CANT_BE_EMPTY_OR_NULL;


@SpringBootTest
@DirtiesContext
public class WeatherForecastTests {

    private Logger log = LoggerFactory.getLogger(WheaterbitClientForecastTests.class);

    // Data For Tests
    private final String countryName = "chile";
    private final String cityName = "santiago";
    private String uri = "http://localhost:8080/api/v1/weather/forecast";
    private Country country = new Country();
    private City city = new City();


    //TODO: unableRetrieveForecast_nullCountryParam only for manual test
    //@Test
    @Ignore
    public void unableRetrieveForecast_nullCountryParam(){

        city.setName(cityName);

        try {
            log.info("CALL_WEATHER_FORECAST_SERVICE");
            WeatherRequest newWeatherRequest = new WeatherRequest();
            newWeatherRequest.setCity(city.getName());

            uri += "?country="+newWeatherRequest.getCountry()+"&city="+newWeatherRequest.getCity();

            RestTemplate restTemplate = new RestTemplate();
            WeatherResponse weatherResponse = restTemplate.getForObject(uri,WeatherResponse.class,newWeatherRequest);

            Assert.fail("DON´T ENTER HERE");
        }catch (WeatherbitException ex){
            log.info("WeatherbitException: " + ex.getMessage());
            Assert.assertEquals(ex.getCode(), PARAM_CANT_BE_EMPTY_OR_NULL.getValue());
        }
    }


    //TODO: unableRetrieveForecast_nullCityParam only for manual test
    //@Test
    @Ignore
    public void unableRetrieveForecast_nullCityParam(){

        country.setName(countryName);

        try {
            log.info("CALL_WEATHER_FORECAST_SERVICE");
            WeatherRequest newWeatherRequest = new WeatherRequest();
            newWeatherRequest.setCountry(country.getName());

            uri += "?country="+newWeatherRequest.getCountry()+"&city="+newWeatherRequest.getCity();

            RestTemplate restTemplate = new RestTemplate();
            WeatherResponse weatherResponse = restTemplate.getForObject(uri,WeatherResponse.class,newWeatherRequest);

            Assert.fail("DON´T ENTER HERE");
        }catch (WeatherbitException ex){
            log.info("WeatherbitException: " + ex.getMessage());
            Assert.assertEquals(ex.getCode(), PARAM_CANT_BE_EMPTY_OR_NULL.getValue());
        }
    }

    //TODO: isComplete_forecastFor7Days only for manual test
    //@Test
    @Ignore
    public void isComplete_forecastFor7Days(){

        country.setName(countryName);
        city.setName(cityName);

        try {
            log.info("CALL_WEATHER_FORECAST_SERVICE");
            WeatherRequest newWeatherRequest = new WeatherRequest();
            newWeatherRequest.setCountry(country.getName());
            newWeatherRequest.setCity(city.getName());

            uri += "?country="+newWeatherRequest.getCountry()+"&city="+newWeatherRequest.getCity();

            RestTemplate restTemplate = new RestTemplate();
            WeatherResponse weatherResponse = restTemplate.getForObject(uri,WeatherResponse.class,newWeatherRequest);

            Long numRecords = Long.valueOf(weatherResponse.getData().size());
            log.info("TOTAL_RECORDS_RETRIEVED: "+numRecords.toString());
            Assert.assertEquals("SERVICE_CUSTOM_RESPONSE_7_RECORDS", Long.valueOf(7),numRecords);
        }catch (WeatherbitException ex){
            log.info("WeatherbitException: " + ex.getMessage());
            Assert.fail("DON´T ENTER HERE");
        }
    }


}
