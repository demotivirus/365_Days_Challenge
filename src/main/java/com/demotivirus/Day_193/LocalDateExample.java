package com.demotivirus.Day_193;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDate tomorrow = localDate.plusDays(1);
        System.out.println(tomorrow);
        LocalDate previousMonth = localDate.minus(1, ChronoUnit.MONTHS); // minus 1 month
        System.out.println(previousMonth);

        LocalDate nextYear = localDate.plus(1, ChronoUnit.YEARS);
        System.out.println(nextYear);

        System.out.println(LocalDate.parse("2021-07-10"));

        DayOfWeek sunday = LocalDate.parse("2016-06-12").getDayOfWeek();
        System.out.println(sunday);

        int numberSix = LocalDate.parse("2016-06-12").getMonthValue();
        System.out.println(numberSix);

        boolean isLeapYear = LocalDate.now().isLeapYear();
        System.out.println(isLeapYear);
    }
}
