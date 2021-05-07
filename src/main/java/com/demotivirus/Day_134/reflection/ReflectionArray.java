package com.demotivirus.Day_134.reflection;

import java.lang.reflect.Array;

public class ReflectionArray {
    public static void main(String[] args) throws ReflectiveOperationException {
        int[] arrayInt = new int[0];

        Class<? extends int[]> clazz = arrayInt.getClass();
        System.out.println("isArray: " + clazz.isArray());
        System.out.println("Name: " + clazz.getTypeName());

        Class<?> componentType = clazz.getComponentType();
        System.out.println("Component type: " + componentType + "\n");

        System.out.println("Creating array:");
        float[] arrayFloat = (float[]) Array.newInstance(float.class, 5);
        System.out.println(arrayFloat.length);
        System.out.println(arrayFloat.getClass().getTypeName());
    }
}
