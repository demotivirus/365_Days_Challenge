package com.demotivirus.Day_102;

public class ShapeFacade {
    private Shape cube;
    private Shape pyramid;
    private Shape sphere;

    public ShapeFacade(){
        cube = new Cube();
        pyramid = new Pyramid();
        sphere = new Sphere();
    }

    public void drawShape(String shapeName){
        Shape shape = FlyWeight.getShape(shapeName);
        shape.draw();
        System.out.println(hashCode());
    }
}
