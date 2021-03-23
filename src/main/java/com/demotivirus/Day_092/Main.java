package com.demotivirus.Day_092;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();

        Shape cube = new Cube();
        cube.draw();

        System.out.println("=======================");

        Shape colorDecorator = new FillColorDecorator(circle, Color.BLACK);
        colorDecorator.draw();

        System.out.println("=======================");

        Shape colorAndLineDecorator =
                new FillColorDecorator(new LineStileDecorator(cube, LineStile.DASH), Color.GREEN);
        colorAndLineDecorator.draw();
    }
}
