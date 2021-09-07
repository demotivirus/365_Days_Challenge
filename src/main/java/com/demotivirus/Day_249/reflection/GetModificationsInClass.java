package com.demotivirus.Day_249.reflection;

import java.lang.reflect.Modifier;

public class GetModificationsInClass {
    public static void main(String[] args) {
        Pair pair = new Pair(1, 1);
        int modifiers = pair.getClass().getModifiers();
        System.out.println(modifiers);

        System.out.println(Modifier.isPublic(modifiers));
        System.out.println(Modifier.isFinal(modifiers));
        System.out.println(Modifier.isProtected(modifiers));
        System.out.println(Modifier.isAbstract(modifiers));
    }
}
