package io.bitjoker.weatherforecast.integration;


import io.bitjoker.weatherforecast.models.City;
import io.bitjoker.weatherforecast.models.Country;
import io.bitjoker.weatherforecast.services.weatherbit.exceptions.WeatherbitException;
import io.bitjoker.weatherforecast.services.weatherbit.models.responses.WeatherbitResponse;
import io.bitjoker.weatherforecast.services.weatherbit.WeatherbitServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import static io.bitjoker.weatherforecast.services.weatherbit.constants.Errors.*;


@RunWith(SpringRunner.class)
@SpringBootTest
@DirtiesContext
class WheaterbitClientForecastTests {

    private Logger log = LoggerFactory.getLogger(WheaterbitClientForecastTests.class);

    private final String countryName = "chile";
    private final String cityName = "santiago";
    private final String invalidCountryName = "invalid";
    private final String invalidCityName = "invalid";

    private Country country = new Country();
    private City city = new City();


    @Test
    public void unableRetrieveForecast_nullCountryParam(){

        country = null;
        city.setName(cityName);

        try {
            log.info("CALL_WEATHERBIT_FORECAST_SERVICE");
            WeatherbitResponse weatherbitResponse = new WeatherbitServiceImpl()
                    .getDailyForecastByCountryAndCity(country,city);
            Assert.fail("DON´T ENTER HERE");
        }catch (WeatherbitException ex){
            log.info("WeatherbitException: " + ex.getMessage());
            Assert.assertEquals(ex.getCode(), PARAM_CANT_BE_EMPTY_OR_NULL.getValue());
        }
    }

    @Test
    public void unableRetrieveForecast_nullCityParam(){

        country.setName(countryName);
        city = null;

        try {
            log.info("CALL_WEATHERBIT_FORECAST_SERVICE");
            WeatherbitResponse weatherbitResponse = new WeatherbitServiceImpl()
                    .getDailyForecastByCountryAndCity(country,city);
            Assert.fail("DON´T ENTER HERE");
        }catch (WeatherbitException ex){
            log.info("WeatherbitException: " + ex.getMessage());
            Assert.assertEquals(ex.getCode(), PARAM_CANT_BE_EMPTY_OR_NULL.getValue());
        }
    }

    @Test
    public void unableRetrieveForecast_emptyCountryParam(){

        country.setName("");
        city.setName(cityName);

        try {
            log.info("CALL_WEATHERBIT_FORECAST_SERVICE");
            WeatherbitResponse weatherbitResponse = new WeatherbitServiceImpl()
                    .getDailyForecastByCountryAndCity(country,city);
            Assert.fail("DON´T ENTER HERE");
        }catch (WeatherbitException ex){
            log.info("WeatherbitException: " + ex.getMessage());
            Assert.assertEquals(ex.getCode(), PARAM_CANT_BE_EMPTY_OR_NULL.getValue());
        }
    }

    @Test
    public void unableRetrieveForecast_emptyCityParam(){

        country.setName(countryName);
        city.setName("");

        try {
            log.info("CALL_WEATHERBIT_FORECAST_SERVICE");
            WeatherbitResponse weatherbitResponse = new WeatherbitServiceImpl()
                    .getDailyForecastByCountryAndCity(country,city);
            Assert.fail("DON´T ENTER HERE");
        }catch (WeatherbitException ex){
            log.info("WeatherbitException: " + ex.getMessage());
            Assert.assertEquals(ex.getCode(), PARAM_CANT_BE_EMPTY_OR_NULL.getValue());
        }
    }

    @Test
    public void isComplete_forecastFor16Days() {

        country.setName(countryName);
        city.setName(cityName);

        try {
            log.info("CALL_WEATHERBIT_FORECAST_SERVICE");
            WeatherbitResponse weatherbitResponse = new WeatherbitServiceImpl()
                    .getDailyForecastByCountryAndCity(country,city);
            Long numRecords = Long.valueOf(weatherbitResponse.getData().size());
            log.info("TOTAL_RECORDS_RETRIEVED: "+numRecords.toString());
            Assert.assertEquals("SERVICE_RESPONSE_16_RECORDS", Long.valueOf(16),numRecords);
        }catch (WeatherbitException ex){
            log.info("WeatherbitException: " + ex.getMessage());
            Assert.fail("DON´T ENTER HERE");
        }
    }

    @Test
    public void unableRetrieveForecast_invalidCountry(){

        country.setName(invalidCountryName);
        city.setName(cityName);

        try{
            log.info("CALL_WEATHERBIT_FORECAST_SERVICE");
            WeatherbitResponse weatherbitResponse = new WeatherbitServiceImpl()
                    .getDailyForecastByCountryAndCity(country,city);
            Assert.fail("DON´T ENTER HERE");
        }catch (WeatherbitException ex){
            log.info("WeatherbitException: " + ex.getMessage());
            Assert.assertEquals(ex.getCode(), RESPONSE_IS_NULL.getValue());
        }
    }

    @Test
    public void unableRetrieveForecast_invalidCity(){

        country.setName(countryName);
        city.setName(invalidCityName);

        try{
            log.info("CALL_WEATHERBIT_FORECAST_SERVICE");
            WeatherbitResponse weatherbitResponse = new WeatherbitServiceImpl()
                    .getDailyForecastByCountryAndCity(country,city);
            Assert.fail("DON´T ENTER HERE");
        }catch (WeatherbitException ex){
            log.info("WeatherbitException: " + ex.getMessage());
            Assert.assertEquals(ex.getCode(), RESPONSE_IS_NULL.getValue());
        }
    }

}
