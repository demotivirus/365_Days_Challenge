package com.demotivirus.Day_089;

import com.demotivirus.Day_089.bridge.WhiteColor;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        System.out.println("======================");

        Shape decoratorShape = new RedShape(circle);
        decoratorShape.draw();
        System.out.println("======================");

        Shape shape = new ShapeDecoratorWithBridge(new WhiteColor(), new Rectangle());
        shape.draw();
    }
}
