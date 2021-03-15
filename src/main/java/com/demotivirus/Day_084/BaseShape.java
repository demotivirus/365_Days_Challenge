package com.demotivirus.Day_084;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data @NoArgsConstructor
@RequiredArgsConstructor
public abstract class BaseShape implements Shape {
    @NonNull
    protected int x;

    @NonNull
    protected int y;

    @NonNull
    protected Color color;

    @Override
    public void print(){
        System.out.println("X:" + x + " Y:" + y + " Color: " + color.name());
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}
