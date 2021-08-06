package com.demotivirus.Day_219;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<? super Numberable> numbers = new ArrayList<>();
        numbers.add(new One());
        numbers.add(new Two());
        numbers.add(new Three());

        for (int i = 0; i < numbers.size(); i++) {
            AbstractNumber object = (AbstractNumber) numbers.get(i);
            System.out.println(object.getDescription());
        }
    }
}
