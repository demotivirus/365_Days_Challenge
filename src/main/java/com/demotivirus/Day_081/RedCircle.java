package com.demotivirus.Day_081;

import lombok.ToString;

@ToString
public class RedCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw red circle with radius " + radius + " x: " + x + " y: " + y);
    }
}
