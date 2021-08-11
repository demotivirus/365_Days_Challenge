package com.demotivirus.Day_223;


import java.util.Objects;

public class CarThree {
    private final String name;
    private String mark;
    private final Color color;

    public CarThree(String name, Color color) {
        if (name == null)
            this.name = "Unknown";
        else this.name = name;

        if (color == null)
            this.color = Color.DEFAULT;
        else this.color = color;
    }

    public CarThree(String name, String mark, Color color) {
        this.name = Objects.requireNonNullElse(name, "Unknown");
        this.mark = Objects.requireNonNullElse(mark, "Unknown mark");
        this.color = Objects.requireNonNullElse(color, Color.DEFAULT);
    }
}
