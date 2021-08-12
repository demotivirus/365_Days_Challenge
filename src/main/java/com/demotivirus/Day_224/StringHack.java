package com.demotivirus.Day_224;

import java.lang.reflect.Field;

public class StringHack {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String userType = "guest";
        System.out.println("User type is: " + userType);

        Class<String> type = String.class;
        Field field = type.getDeclaredField("value");
        field.setAccessible(true);

        char[] chars = (char[]) field.get(userType); //ClassCastEx
        chars[0] = 'a';
        chars[1] = 'd';
        chars[2] = 'm';
        chars[3] = 'i';
        chars[4] = 'n';

        System.out.println("User type is: " + userType);
    }
}
