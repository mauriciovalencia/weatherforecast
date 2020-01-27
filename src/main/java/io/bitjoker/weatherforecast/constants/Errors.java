package io.bitjoker.weatherforecast.constants;

public enum Errors {

    PARAM_IS_NOT_VALID(800,"%s is not valid %s"),
    PARAM_IS_EMPTY(801,"%s is empty"),
    PARAM_CANT_BE_EMPTY_OR_NULL(802,"%s can´t be null or empty"),
    PARAM_ALREADY_EXIST(803, "this %s is already exist on %s");

    private final int code;
    private final String message;

    Errors(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    public Integer getValue(){ return code; }
    public String getMessage() {return message;}

}
