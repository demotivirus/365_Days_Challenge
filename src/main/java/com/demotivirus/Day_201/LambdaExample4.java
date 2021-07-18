package com.demotivirus.Day_201;

public class LambdaExample4 {
    public static void main(String[] args) {
        TriFunction<Color, Integer, Integer, Orange> triFunction = Orange::new; //create obj with 3 params
        Orange orange = triFunction.apply(Color.ORANGE, 200, 20);
        System.out.println(orange);
    }
}
