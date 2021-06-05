package com.demotivirus.Day_160;

public enum BotEnvironments {
    WEATHER_BOT_USERNAME("JavaWeatherApiBot"),
    WEATHER_BOT_TOKEN("1849167596:AAFEQMDIuXQwUqr93XYQb78aAnDKCWCC-i4");

    private String text;

    private BotEnvironments(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
