package com.demotivirus.Day_077;

import lombok.Data;

@Data
public class Oval extends Shape {

    public Oval(Oval target){
        super(target);
    }

    @Override
    public Shape clone() {
        return new Oval(this);
    }
}
