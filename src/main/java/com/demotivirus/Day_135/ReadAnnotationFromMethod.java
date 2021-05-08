package com.demotivirus.Day_135;

import java.lang.reflect.Method;

public class ReadAnnotationFromMethod {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<SimpleClass> clazz = SimpleClass.class;

        var doNothing = clazz.getDeclaredAnnotations();

        for (var annotation : doNothing) {
            if (annotation instanceof Reflectable) {
                Reflectable reflectable = (Reflectable) annotation;
                System.out.println(reflectable.name());
                System.out.println(reflectable.value());
            }
        }
    }
}
