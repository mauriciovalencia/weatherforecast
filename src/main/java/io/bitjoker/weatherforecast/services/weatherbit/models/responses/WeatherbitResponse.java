
package io.bitjoker.weatherforecast.services.weatherbit.models.responses;

import java.util.List;


public class WeatherbitResponse {

    private List<Data> data;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

}
