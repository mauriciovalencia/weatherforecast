package io.bitjoker.weatherforecast.services.weatherbit.exceptions;

import static io.bitjoker.weatherforecast.services.weatherbit.constants.Errors.PARAM_IS_NOT_VALID;

public class InvalidParamException extends WeatherbitException {

    public InvalidParamException(String params, String detail){
        super (String.format(PARAM_IS_NOT_VALID.getMessage(), params, detail), PARAM_IS_NOT_VALID.getValue());
    }

}
