package com.demotivirus.Day_214.Tip_07;

public abstract class Shape {
    protected DrawApi drawApi;

    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
