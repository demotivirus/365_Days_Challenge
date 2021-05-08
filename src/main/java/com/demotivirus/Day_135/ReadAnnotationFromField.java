package com.demotivirus.Day_135;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;

public class ReadAnnotationFromField {
    public static void main(String[] args) throws NoSuchFieldException {
        Class<SimpleClass> clazz = SimpleClass.class;

        Field field = clazz.getDeclaredField("field");
        Annotation[] annotations = field.getAnnotations();
        System.out.println(Arrays.toString(annotations));
    }
}
