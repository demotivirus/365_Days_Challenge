package com.demotivirus.Day_209.Tip_03;

import com.demotivirus.Day_209.Tip_01.Rectangle;
import com.demotivirus.Day_209.Tip_01.Shape;

public class ShapeFactory {
    public static Shape create(String shapeName) {
        if (shapeName == null)
            return null;
        if (shapeName.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        else return null;
    }
}
