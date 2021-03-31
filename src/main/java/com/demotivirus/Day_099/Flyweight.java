package com.demotivirus.Day_099;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flyweight {
    private static Map<String, Shape> shapes = new HashMap<>();

    public static Cube getCube(){
       Cube cube = (Cube) shapes.get("cube");
       if (cube == null){
           cube = new Cube();
           shapes.put("cube", cube);
       }
       return cube;
    }

    public static Circle getCircle(){
        Circle circle = (Circle) shapes.get("circle");
        if (circle == null){
            circle = new Circle();
            shapes.put("circle", circle);
        }
        return circle;
    }
}
