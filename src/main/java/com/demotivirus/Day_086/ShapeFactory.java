package com.demotivirus.Day_086;

public class ShapeFactory {
    private ShapeFactory(){}

    public static Shape create(String shape){
        switch (shape.toLowerCase()){
            case "oval": return new Oval();
            case "triangle": return new Triangle();
            case "cube": return new Cube();
        }
        return null;
    }

    public static Shape createWithColor(String shape, Color color){
        switch (shape.toLowerCase()){
            case "oval": return new Oval(color);
            case "triangle": return new Triangle(color);
            case "cube": return new Cube(color);
        }
        return null;
    }
}
