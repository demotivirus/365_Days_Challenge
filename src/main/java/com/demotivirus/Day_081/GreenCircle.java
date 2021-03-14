package com.demotivirus.Day_081;

import lombok.ToString;

@ToString
public class GreenCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw green circle with radius " + radius + " x: " + x + " y: " + y);
    }
}
