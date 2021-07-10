package com.demotivirus.Day_193;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodExample {
    public static void main(String[] args) {
        LocalDate initDate = LocalDate.parse("2000-01-01");
        LocalDate finalDate = initDate.plus(Period.ofDays(10));
        System.out.println(finalDate);

        int tenNumber = Period.between(initDate, finalDate).getDays();
        System.out.println(tenNumber);
        long chronoUnit = ChronoUnit.DAYS.between(initDate, finalDate);
        System.out.println(chronoUnit);
    }
}
