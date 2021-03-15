package com.demotivirus.Day_084;

import lombok.NonNull;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class CompositeShape extends BaseShape{
    private List<Shape> shapes = new ArrayList<>();

    public CompositeShape(@NonNull int x, @NonNull int y, @NonNull Color color) {
        super(x, y, color);
    }

    public void addShape(Shape shape){
        shapes.add(shape);
    }
}
