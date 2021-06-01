package com.demotivirus.Day_157;

import java.util.Optional;

public class OptionalTest2 {
    public static void main(String[] args) {
        System.out.println(Optional.of(5).flatMap(Optional::of));
        System.out.println(Optional.of(5));
    }
}
