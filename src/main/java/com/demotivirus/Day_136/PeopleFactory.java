package com.demotivirus.Day_136;

public class PeopleFactory {
    public static People createPeople(String name, int age) {
        if (age > 127 || age < 0) {
            System.err.println("An attempt to create a person outside the bounds of what is permitted is suppressed");
            return new People(name, (byte) 0);
        }
        return new People(name, (byte) age);
    }
}
