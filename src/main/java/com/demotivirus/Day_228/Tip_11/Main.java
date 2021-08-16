package com.demotivirus.Day_228.Tip_11;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redTriangle = new RedShapeDecorator(new Triangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redTriangle.draw();
    }
}
