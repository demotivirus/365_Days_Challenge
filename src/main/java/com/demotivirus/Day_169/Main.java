package com.demotivirus.Day_169;

public class Main {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.create("dog");
        dog.setName("Billy");
        System.out.println(dog);

        Animal cat = AnimalFactory.create("cat");
        cat.setName("Jean");
        System.out.println(cat);
    }
}
