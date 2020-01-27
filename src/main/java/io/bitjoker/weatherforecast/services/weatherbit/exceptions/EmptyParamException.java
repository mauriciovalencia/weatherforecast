package io.bitjoker.weatherforecast.services.weatherbit.exceptions;

import static io.bitjoker.weatherforecast.services.weatherbit.constants.Errors.PARAM_CANT_BE_EMPTY_OR_NULL;

public class EmptyParamException extends WeatherbitException {

    public EmptyParamException(String params){
        super (String.format(PARAM_CANT_BE_EMPTY_OR_NULL.getMessage(), params), PARAM_CANT_BE_EMPTY_OR_NULL.getValue());
    }
}
