package com.demotivirus.Day_193;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println(LocalDateTime.of(2022, Month.JANUARY, 01, 6, 30));
        System.out.println(LocalDateTime.parse("2021-07-10T19:27:32.274522500"));

        System.out.println(localDateTime.plusDays(10));
        System.out.println(localDateTime.minusHours(5));
        System.out.println(localDateTime.getMonth());
    }
}
