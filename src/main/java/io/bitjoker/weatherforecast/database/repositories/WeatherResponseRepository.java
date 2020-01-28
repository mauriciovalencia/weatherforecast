package io.bitjoker.weatherforecast.database.repositories;

import io.bitjoker.weatherforecast.database.entities.WeatherResponseEntity;
import org.springframework.data.repository.CrudRepository;

public interface WeatherResponseRepository extends CrudRepository<WeatherResponseEntity, Integer> {

}