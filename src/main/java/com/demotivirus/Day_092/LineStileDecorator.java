package com.demotivirus.Day_092;

public class LineStileDecorator extends ShapeDecorator {
    private LineStile lineStile;

    public LineStileDecorator(Shape shape, LineStile lineStile) {
        super(shape);
        this.lineStile = lineStile;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Line stile: " + lineStile);
    }
}
