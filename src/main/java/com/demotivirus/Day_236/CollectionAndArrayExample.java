package com.demotivirus.Day_236;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.demotivirus.Day_236.Type.*;

public class CollectionAndArrayExample {
    public static void main(String[] args) {
        List<Melon> melons = new ArrayList<>() {{
            add(new Melon(HONEY, 3600));
            add(new Melon(GOLD, 3400));
            add(new Melon(YELLOW, 2300));
            add(new Melon(HONEY, 2300));
            add(new Melon(YELLOW, 2300));
            add(new Melon(GOLD, 2200));
        }};

        List<Type> melonsByType = Arrays.asList(HONEY, GOLD); //find in collection only this types

        List<Melon> result = melons.stream()
                .filter(t -> melonsByType.contains(t.getType()))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
