package com.demotivirus.Day_092;

public class FillColorDecorator extends ShapeDecorator{
    private Color color;

    public FillColorDecorator(Shape shape, Color color) {
        super(shape);
        this.color = color;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Fill color: " + color);
    }
}
