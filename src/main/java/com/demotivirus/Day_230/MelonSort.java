package com.demotivirus.Day_230;

import java.util.Arrays;
import java.util.Comparator;

public class MelonSort {
    public static void main(String[] args) {
        Melon[] melons = {new Melon(Type.GREEN, 17), new Melon(Type.GREEN, 15)};

        Arrays.sort(melons, new Comparator<Melon>(){
           @Override
           public int compare(Melon one, Melon two) {
             return Integer.compare(one.getWeight(), two.getWeight());
           };
        });
        System.out.println(Arrays.toString(melons));

        Arrays.sort(melons, (Melon one, Melon two) -> Integer.compare(one.getWeight(), two.getWeight()));
        System.out.println(Arrays.toString(melons));
    }
}
