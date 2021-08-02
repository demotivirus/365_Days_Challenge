package com.demotivirus.Day_214_215.Tip_11;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class ShapeDecorator implements Shape {
    protected Shape shape;

    public void draw() {
        shape.draw();
    }
}
