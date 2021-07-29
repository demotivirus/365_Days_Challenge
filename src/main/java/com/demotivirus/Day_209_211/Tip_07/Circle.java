package com.demotivirus.Day_209_211.Tip_07;

public class Circle extends Shape {
    private int x, y, radius;

    protected Circle(int radius, int x, int y, DrawApi drawApi) {
        super(drawApi);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y); //this field came in abstract class
    }
}
