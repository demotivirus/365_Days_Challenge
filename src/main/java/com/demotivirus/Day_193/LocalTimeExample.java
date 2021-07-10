package com.demotivirus.Day_193;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime sixThirty = LocalTime.parse("06:30");
        System.out.println(sixThirty);

        LocalTime sixThirtyToo = LocalTime.of(6, 30);
        System.out.println(sixThirtyToo);

        LocalTime sevenThirty = sixThirty.plus(1, ChronoUnit.HOURS);
        System.out.println(sevenThirty);

        int sixNumber = sixThirty.getHour();
        System.out.println(sixNumber);

        boolean isBefore = sixThirty.isBefore(sevenThirty);
        System.out.println(isBefore);

        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
    }
}
