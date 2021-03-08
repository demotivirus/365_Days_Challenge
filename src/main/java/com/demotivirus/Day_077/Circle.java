package com.demotivirus.Day_077;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class Circle extends Shape {
    private int radius;

    public Circle(Circle target) {
        super(target);
        if (target != null)
            this.radius = target.getRadius();
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle{x=" + super.getX() + " y=" + super.getY() + " color=" + super.getColor() +
                " radius=" + radius +
                '}';
    }
}
