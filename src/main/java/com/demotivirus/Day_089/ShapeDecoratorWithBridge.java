package com.demotivirus.Day_089;

import com.demotivirus.Day_089.bridge.Color;

public class ShapeDecoratorWithBridge implements Shape {
    protected Color color;
    protected Shape decorator;

    public ShapeDecoratorWithBridge(Color color, Shape shape) {
        this.color = color;
        this.decorator = shape;
    }

    @Override
    public void draw(){
        decorator.draw();
        color.printColor();
    }
}
