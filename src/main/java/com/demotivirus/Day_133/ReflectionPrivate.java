package com.demotivirus.Day_133;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionPrivate {
    public static void main(String[] args) throws ReflectiveOperationException {
        Class<Demo> clazz = Demo.class;

        Constructor<Demo> constructor = clazz.getConstructor();
        Demo obj = constructor.newInstance();

        Method privateMethod = clazz.getDeclaredMethod("secretMethod");
        privateMethod.setAccessible(true); //set method private
        privateMethod.invoke(obj);
        System.out.println();

        Field privateField = clazz.getDeclaredField("value");
        privateField.setAccessible(true);
        privateField.set(obj, "private value changed");
        System.out.println(privateField.get(obj));
    }
}
