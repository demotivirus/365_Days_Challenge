package com.demotivirus.Day_077;

import lombok.Data;

@Data
public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(Rectangle target){
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
