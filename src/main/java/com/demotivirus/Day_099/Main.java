package com.demotivirus.Day_099;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Cube cube = Flyweight.getCube();
            System.out.println(cube.hashCode());
        }
    }
}
