package com.demotivirus.Day_073.eat;

public class EatFactory {
    public static Eat factory(String eat){
        switch (eat.toLowerCase()){
            case "fish" : return new Fish();
            case "milk": return new Milk();
            case "buckwheat": return new Buckwheat();
            default: return null;
        }
    }
}
