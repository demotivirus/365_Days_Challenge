package com.demotivirus.Day_086;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("========PROTOTYPE===========");
        Oval oval = new Oval();
        Oval oval2 = (Oval) oval.clone();
        oval2.draw();

        System.out.println("=========FACTORY=========");
        Oval oval3 = (Oval) ShapeFactory.create("oval");
        oval3.draw();

        System.out.println("=========BRIDGE===========");
        oval.setColor(new GreenColor());
        oval.draw();

        System.out.println("=========FACTORY=========");
        Cube cube = (Cube) ShapeFactory.createWithColor("cube", new RedColor());
        cube.draw();

        System.out.println("=========COMPOSITE==========");
        cube.addShape("cube");
        cube.addShape("triangle");
        cube.addShape("oval");
        cube.printAllShapes();
    }
}
