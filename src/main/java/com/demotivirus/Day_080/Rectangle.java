package com.demotivirus.Day_080;

import lombok.NonNull;

public class Rectangle extends Shape {
    public Rectangle(@NonNull Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle draw");
        color.fillColor();
    }
}
