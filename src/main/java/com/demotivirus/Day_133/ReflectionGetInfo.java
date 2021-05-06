package com.demotivirus.Day_133;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionGetInfo {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<Demo> clazz = Demo.class;
        System.out.println(clazz.getSimpleName() + "\n");

        Constructor<?> [] constructors = clazz.getConstructors();
        System.out.println(Arrays.toString(constructors) + "\n");

        Method[] methodsPublic = clazz.getMethods();
        Arrays.stream(methodsPublic)
                .forEach(method -> System.out.println(method.getName()));
        System.out.println();

        Method[] methodsPrivate = clazz.getDeclaredMethods();
        Arrays.stream(methodsPrivate)
                .forEach(method -> System.out.println(method.getName()));
        System.out.println();

        Field[] publicFields = clazz.getFields();
        System.out.println(Arrays.toString(publicFields) + "\n");

        Field[] allFields = clazz.getDeclaredFields();
        System.out.println(Arrays.toString(allFields) + "\n");

        System.out.println("Annotations: ");
        Method annotatedMethod = clazz.getMethod("toString");
        Annotation[] annotations = annotatedMethod.getDeclaredAnnotations();
        System.out.println(Arrays.toString(annotations));
    }
}
