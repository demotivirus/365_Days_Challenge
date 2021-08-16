package com.demotivirus.Day_228.Tip_11;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class ShapeDecorator implements Shape {
    protected Shape shape;

    public void draw() {
        shape.draw();
    }
}
