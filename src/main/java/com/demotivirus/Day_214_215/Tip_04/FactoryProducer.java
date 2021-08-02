package com.demotivirus.Day_214_215.Tip_04;

import com.demotivirus.Day_209_211.Tip_04.AbstractFactory;
import com.demotivirus.Day_209_211.Tip_04.RoundedShapeFactory;
import com.demotivirus.Day_209_211.Tip_04.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type) {
        if (type.equals("rounded"))
            return new RoundedShapeFactory();
        else return new ShapeFactory();
    }
}
