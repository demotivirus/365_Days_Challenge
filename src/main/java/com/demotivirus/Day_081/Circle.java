package com.demotivirus.Day_081;

import lombok.ToString;

@ToString
public class Circle extends Shape {
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
