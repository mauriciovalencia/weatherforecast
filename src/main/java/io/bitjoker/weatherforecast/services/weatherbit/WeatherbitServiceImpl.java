package io.bitjoker.weatherforecast.services.weatherbit;

import io.bitjoker.weatherforecast.models.City;
import io.bitjoker.weatherforecast.models.Country;
import io.bitjoker.weatherforecast.services.weatherbit.exceptions.EmptyParamException;
import io.bitjoker.weatherforecast.services.weatherbit.exceptions.InvalidParamException;
import io.bitjoker.weatherforecast.services.weatherbit.exceptions.NullResponseException;
import io.bitjoker.weatherforecast.services.weatherbit.models.responses.WeatherbitResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherbitServiceImpl implements WeatherbitService {

    // =============== Settings =============
    // temporal
    private Logger log = LoggerFactory.getLogger(WeatherbitServiceImpl.class);
    private final String baseURL = "http://api.weatherbit.io/v2.0/";
    private final String apiKey = "6b904a49933644589f36d6cf0ad6e24d";

    @Override
    public String getCurrentDateForecast() {
        return null;
    }

    @Override
    public String getDailyForecastByLatAndLong(Double latitude, Double longitude) {
        return null;
    }

    @Override
    public String getDailyForecastByCityId(City cityId) {
        return null;
    }

    @Override
    public WeatherbitResponse getDailyForecastByCountryAndCity(Country country, City city) {

        // =============== Settings =============
        WeatherbitResponse result;

        // =============== Validations =============

        // is country and countryName null or empty
        if(country == null){
            throw new EmptyParamException("country");
        }else if(null == country.getName() || country.getName().isEmpty()) {
            throw new EmptyParamException("country");
        }

        // is city and cityName null or empty
        if(city == null){
            throw new EmptyParamException("city");
        }else if(null == city.getName() || city.getName().isEmpty()){
            throw new EmptyParamException("city");
        }

        String apiUri = baseURL + "forecast/daily?city="+city.getName()
                +"&country="+country.getName()+"&key="+apiKey;
        RestTemplate restTemplate = new RestTemplate();
        result = restTemplate.getForObject(apiUri, WeatherbitResponse.class);
        if(result == null){
            throw new NullResponseException("daily forecast");
        }
        return result;
    }


}
