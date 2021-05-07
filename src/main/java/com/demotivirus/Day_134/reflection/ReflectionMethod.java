package com.demotivirus.Day_134.reflection;

import com.demotivirus.Day_133.Demo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionMethod {
    public static void main(String[] args) throws ReflectiveOperationException {
        Class<Demo> clazz = Demo.class;

        Method method = clazz.getMethod("toString");
        System.out.println(method.getName());

        Annotation[] annotation = method.getDeclaredAnnotations();
        System.out.println(Arrays.toString(annotation) + "\n");

        System.out.println("Get modifier:");
        int modifier = method.getModifiers();
        System.out.println("isPublic: " + Modifier.isPublic(modifier));
        System.out.println("isProtected: " + Modifier.isProtected(modifier));
        System.out.println("isPrivate: " + Modifier.isPrivate(modifier) + "\n");

        Object testField = method.invoke(new Demo(10, "testField"));
        System.out.println("Result: " + testField);
    }
}
