package com.demotivirus.Day_209_210.Tip_07;

public class RedCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.printf("Drawing red circle with %d radius, %d x and %d y \n", radius, x, y);
    }
}
