package com.demotivirus.Day_136;

public class PeopleFactory {
    public static People createPeople(String name, int age) {
        if (age > 127 || age < 0)
            return new People();
        return new People(name, (byte) age);
    }
}
