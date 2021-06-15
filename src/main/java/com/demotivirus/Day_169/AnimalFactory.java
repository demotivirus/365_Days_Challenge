package com.demotivirus.Day_169;

public class AnimalFactory {
    public static Animal create(String name) {
        if (name.equalsIgnoreCase("cat"))
            return new Cat();
        if (name.equalsIgnoreCase("dog"))
            return new Dog();
        else return null;
    }
}
