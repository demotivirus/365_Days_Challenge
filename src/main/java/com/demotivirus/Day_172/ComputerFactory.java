package com.demotivirus.Day_172;

public class ComputerFactory {
    public static Computer create(ComputerAbstractFactory abstractFactory) {
        return abstractFactory.create();
    }
}
