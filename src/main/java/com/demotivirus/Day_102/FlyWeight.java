package com.demotivirus.Day_102;

import java.util.HashMap;
import java.util.Map;

public class FlyWeight {
    private static Map<String, Shape> shapes = new HashMap<>();

    public static Shape getShape(String shapeName) {
        Shape shape = shapes.get("shapeName");
        if (shape == null) shape = switch (shapeName) {
            case "cube" -> new Cube();
            case "sphere" -> new Sphere();
            case "pyramid" -> new Pyramid();
            default -> throw new IllegalStateException("Unexpected value: " + shapeName);
        };
        shapes.put("cube", shape);
        return shape;
    }
}
