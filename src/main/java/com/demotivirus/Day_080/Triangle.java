package com.demotivirus.Day_080;

import lombok.NonNull;

public class Triangle extends Shape {
    public Triangle(@NonNull Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Triangle draw");
        color.fillColor();
    }
}
