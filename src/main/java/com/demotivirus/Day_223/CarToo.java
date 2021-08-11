package com.demotivirus.Day_223;

public class CarToo {
    private final String name;
    private final Color color;

    public CarToo(String name, Color color) {
        this.name = MyObjects.requireNotNullOrElseThrow(name,
                new UnsupportedOperationException("Name cannot be set as null"));
        this.color = MyObjects.requireNotNullOrElseThrow(color,
                new UnsupportedOperationException("Color cannot be set as null"));
    }
}
