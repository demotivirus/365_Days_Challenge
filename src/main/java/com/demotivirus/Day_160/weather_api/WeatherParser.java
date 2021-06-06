package com.demotivirus.Day_160.weather_api;

import com.demotivirus.Day_160.BotEnvironments;
import org.springframework.web.client.RestTemplate;
import java.net.URI;
import java.net.URISyntaxException;

public class WeatherParser {
    public static String getCelsiusTemp(String city){
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city +
                "&appid=" + BotEnvironments.WEATHER_APP_ID.getText();

        double celsiusTemp = 0d;
        try {
            Weather weather = restTemplate.getForObject(new URI(url), Weather.class);
            System.out.println(weather);
            celsiusTemp = Math.round(weather.getMain().getTemp() - 273.15);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return String.valueOf(celsiusTemp);
    }
}
