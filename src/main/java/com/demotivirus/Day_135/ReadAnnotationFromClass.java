package com.demotivirus.Day_135;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class ReadAnnotationFromClass {
    public static void main(String[] args) {
        Class<SimpleClass> clazz = SimpleClass.class;
        Annotation[] annotations = clazz.getAnnotations();

        System.out.println(Arrays.toString(annotations));
    }
}
