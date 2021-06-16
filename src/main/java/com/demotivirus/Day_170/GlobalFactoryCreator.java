package com.demotivirus.Day_170;

public class GlobalFactoryCreator {
    public GlobalFactory create(String name) {
        if (name.equalsIgnoreCase("dates"))
            return new DatesFactory();
        else return new DriedApplesFactory();
    }
}
