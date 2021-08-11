package com.demotivirus.Day_223;

import java.util.Objects;

public class Car {
    private final String name;
    private final Color color;

    public Car(String name, Color color) {
//        if (Objects.isNull(name) || Objects.isNull(color))
//            throw new NullPointerException("Field must not by null");
//        this.name = name;
//        this.color = color;
        this.name = Objects.requireNonNull(name, "Name must not be null");
        this.color = Objects.requireNonNull(color, "Color must not be null");
    }
}
