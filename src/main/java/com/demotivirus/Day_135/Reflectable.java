package com.demotivirus.Day_135;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD}) //FOR CLASSES & INTERFACES + METHODS
@Retention(RetentionPolicy.RUNTIME)
public @interface Reflectable {
    String name() default "";
    String value() default "";
}
