package io.bitjoker.weatherforecast.services.weatherbit.exceptions;

import static io.bitjoker.weatherforecast.services.weatherbit.constants.Errors.PARAM_ALREADY_EXIST;

public class ExistParamException extends WeatherbitException {

    public ExistParamException(String params, String where){
        super (String.format(PARAM_ALREADY_EXIST.getMessage(), params, where), PARAM_ALREADY_EXIST.getValue());
    }

}
