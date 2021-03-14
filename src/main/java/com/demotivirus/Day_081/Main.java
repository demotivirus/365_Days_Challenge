package com.demotivirus.Day_081;

public class Main {
    public static void main(String[] args) {
        Shape greenCircle = new Circle(200, 200, 10, new GreenCircle());
        Shape redCircle = new Circle(400, 400, 15, new RedCircle());
        System.out.println(greenCircle);
        System.out.println(redCircle);
    }
}
