package com.demotivirus.Day_086;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@Setter
@NoArgsConstructor
public abstract class AbstractShape implements Shape {
    private List<Shape> shapes = new ArrayList<>();
    protected Color color;

    public AbstractShape(Color color){
        this.color = color;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void draw() {
        System.out.println("This class is " + getClass().getSimpleName());
        if (color != null)
            color.printColor();
    }

    public void addShape(String shape){
        shapes.add(ShapeFactory.create(shape));
    }

    public void removeShape(String shape){
        shapes.remove(ShapeFactory.create(shape));
    }

    public void printAllShapes(){
        System.out.println("In " + getClass().getSimpleName() + ": ");
        System.out.print("[");
        for (Shape s : shapes)
            System.out.print(s + ", ");
        System.out.println("]");
    }
}

