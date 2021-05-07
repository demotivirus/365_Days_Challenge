package com.demotivirus.Day_134.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
public @interface BigAnnotation {
    enum Priority {LOW, MEDIUM, HIGH}

    String value();

    String[] changeBy() default "author";

    String[] lastChangeBy() default "";

    Priority priority() default Priority.MEDIUM;

    String lastChanged() default "2000-01-01";
}
