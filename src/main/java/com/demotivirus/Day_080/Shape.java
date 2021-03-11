package com.demotivirus.Day_080;

import lombok.Data;
import lombok.NonNull;

@Data
public abstract class Shape {
    @NonNull
    protected Color color;
    public abstract void draw();
}
