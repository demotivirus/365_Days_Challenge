package com.demotivirus.Day_209_211.Tip_04;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type) {
        if (type.equals("rounded"))
            return new RoundedShapeFactory();
        else return new ShapeFactory();
    }
}
