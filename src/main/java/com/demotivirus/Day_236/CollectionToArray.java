package com.demotivirus.Day_236;

import java.util.Arrays;
import java.util.List;

public class CollectionToArray {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Maria", "Russo");
        Object[] objects = names.toArray(); //it/s bad because were String

        String[] namesArr = names.toArray(String[]::new); //it's good
    }
}
