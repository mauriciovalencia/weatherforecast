package io.bitjoker.weatherforecast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class WeatherforecastApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherforecastApplication.class, args);
    }

}
