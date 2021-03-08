package com.demotivirus.Day_077;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(10);
        circle.setColor("red");
        circle.setRadius(15);

        Circle cloneCircle = (Circle) circle.clone();
        boolean isEquals = circle.equals(cloneCircle);
        System.out.println(isEquals);
        System.out.println(cloneCircle);
    }
}
