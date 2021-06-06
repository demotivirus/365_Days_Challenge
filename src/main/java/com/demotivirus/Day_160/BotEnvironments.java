package com.demotivirus.Day_160;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BotEnvironments {
    WEATHER_BOT_USERNAME("JavaWeatherApiBot"),
    WEATHER_BOT_TOKEN("1849167596:AAFEQMDIuXQwUqr93XYQb78aAnDKCWCC-i4"),
    WEATHER_APP_ID("6e3402343dbaeb622fa51ac79ed6e839");

    private String text;
}
