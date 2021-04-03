package com.demotivirus.Day_102;

public class Main {
    public static void main(String[] args) {
        Cube cube = (Cube) FlyWeight.getShape("cube");
        for (int i = 0; i < 10; i++) {
            System.out.println(cube.hashCode());
        }
        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.drawShape("pyramid");
        shapeFacade.drawShape("pyramid");
    }
}
