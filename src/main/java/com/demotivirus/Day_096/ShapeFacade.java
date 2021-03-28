package com.demotivirus.Day_096;

public class ShapeFacade {
    private Circle circle;
    private Triangle triangle;
    private Rectangle rectangle;

    public ShapeFacade(){
        circle = new Circle();
        triangle = new Triangle();
        rectangle = new Rectangle();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawTriangle(){
        triangle.draw();
    }
}
