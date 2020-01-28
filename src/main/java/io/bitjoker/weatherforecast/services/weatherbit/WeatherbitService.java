package io.bitjoker.weatherforecast.services.weatherbit;

import io.bitjoker.weatherforecast.helpers.Unimplimented;
import io.bitjoker.weatherforecast.models.City;
import io.bitjoker.weatherforecast.models.Country;
import io.bitjoker.weatherforecast.services.weatherbit.models.responses.WeatherbitResponse;

public interface WeatherbitService {

    /**
     * ==================== 16 daily forecast =======================
     * Based on official documentation https://www.weatherbit.io/api/swaggerui/weather-api-v2#!/
     */
    @Unimplimented
    String getCurrentDateForecast (); //TODO: just for implement later
    @Unimplimented
    String getDailyForecastByLatAndLong(Double latitude, Double longitude); //TODO: just for implement later
    @Unimplimented
    String getDailyForecastByCityId(City cityId); //TODO: just for implement later
    //String getDailyForecastByPostalCode(PostalCode pc); //TODO: just for implement later

    /**
     *
     * @param country
     * @param city
     * @param daysLimit
     * @return { WeatherbitResponse }
     * @description Return 16 day forecast, review WheaterbitResponse Object
     */
    WeatherbitResponse getDailyForecastByCountryAndCityAndDaysLimit(Country country, City city, Integer daysLimit);

}
