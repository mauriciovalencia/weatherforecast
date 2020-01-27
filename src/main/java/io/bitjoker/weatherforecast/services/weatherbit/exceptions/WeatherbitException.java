package io.bitjoker.weatherforecast.services.weatherbit.exceptions;

import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

public class WeatherbitException extends RuntimeException {

    @Getter @Setter private Integer code;
    @Getter private final String uuid = UUID.randomUUID().toString();

    public WeatherbitException(String message, Integer exceptionCode) {
        super(message);
        code = exceptionCode;
    }

    @Override
    public String getMessage() {
        if (null == super.getMessage()) {
            return toString();
        }
        return super.getMessage();
    }

    public Integer getCode(){
        return code;
    }

    @Override
    public String toString() {
        return "WeatherbitException(code=" + this.getCode() + ", uuid=" +
                this.getUuid() + ")";
    }

}