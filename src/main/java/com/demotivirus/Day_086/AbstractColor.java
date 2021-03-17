package com.demotivirus.Day_086;

public abstract class AbstractColor implements Color {
    @Override
    public void printColor() {
        System.out.println("His color is " + getClass().getSimpleName());
    }
}
