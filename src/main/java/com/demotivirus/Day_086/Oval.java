package com.demotivirus.Day_086;

import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
public class Oval extends AbstractShape {
    public Oval(Color color) {
        super(color);
    }

//    @Override
//    public void draw() {
//        System.out.println("Oval");
//        color.printColor();
//    }
}
