package com.demotivirus.Day_089;

public class RedShape extends ShapeDecorator {
    public RedShape(Shape decorator) {
        super(decorator);
    }

    @Override
    public void draw(){
        decorator.draw();
        printColor();
    }

    private void printColor(){
        System.out.println("Fill red color");
    }
}
