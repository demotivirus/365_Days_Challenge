package com.demotivirus.Day_089;

public abstract class ShapeDecorator implements Shape {
    protected Shape decorator;

    public ShapeDecorator(Shape decorator){
        this.decorator = decorator;
    }

    @Override
    public void draw(){
        decorator.draw();
    }
}
