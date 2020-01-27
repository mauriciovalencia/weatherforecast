package io.bitjoker.weatherforecast.services.weatherbit.exceptions;


import static io.bitjoker.weatherforecast.services.weatherbit.constants.Errors.RESPONSE_IS_NULL;

public class NullResponseException extends WeatherbitException {

    public NullResponseException(String params){
        super(String.format(RESPONSE_IS_NULL.getMessage(), params),RESPONSE_IS_NULL.getValue());
    }
}
