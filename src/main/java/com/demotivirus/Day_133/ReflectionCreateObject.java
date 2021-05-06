package com.demotivirus.Day_133;

import java.lang.reflect.Constructor;

public class ReflectionCreateObject {
    public static void main(String[] args) throws ReflectiveOperationException {
        Class<Demo> demoClass = Demo.class;

        Constructor<Demo> constructor = demoClass.getConstructor(int.class, String.class);
        Demo createObjectFromReflection = constructor.newInstance(10, "test");

        System.out.println(createObjectFromReflection.getValue());
    }
}
