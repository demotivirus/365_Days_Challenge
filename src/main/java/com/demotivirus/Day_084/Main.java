package com.demotivirus.Day_084;

public class Main {
    public static void main(String[] args) {
        Shape dot = new Dot(3,3, Color.BLACK);
        dot.print();

        Shape circle = new Circle(3,3,10, Color.BLUE);
        circle.print();

        CompositeShape compositeShape = new CompositeShape(5,5, Color.WHITE);
        compositeShape.addShape(circle);
        compositeShape.addShape(dot);
        compositeShape.print();
    }
}
