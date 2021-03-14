package com.demotivirus.Day_081;

import lombok.ToString;

@ToString
public abstract class Shape {
    protected DrawApi drawApi;

    public Shape(DrawApi drawApi){
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
