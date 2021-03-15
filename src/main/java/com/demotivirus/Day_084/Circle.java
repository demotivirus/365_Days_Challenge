package com.demotivirus.Day_084;

import lombok.NonNull;
import lombok.ToString;

@ToString
public class Circle extends BaseShape {
    private int radius;

    public Circle(@NonNull int x, @NonNull int y, int radius, @NonNull Color color) {
        super(x, y, color);
    }

    @Override
    public void print() {
        System.out.println("X:" + x + " Y:" + y + " Radius: " + radius + " Color: " + color.name());
    }
}
