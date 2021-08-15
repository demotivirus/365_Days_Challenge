package com.demotivirus.Day_227;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class CalculateAge {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1979, 2, 1);
        LocalDate today = LocalDate.now();

        long years = ChronoUnit.YEARS.between(birthday, today);
        System.out.println("Years: " + years);

        long weeks = ChronoUnit.WEEKS.between(birthday, today);
        System.out.println("Weeks: " + weeks);

        long days = ChronoUnit.DAYS.between(birthday, today);
        System.out.println("Days: " + days);

        LocalDateTime localDateTime = LocalDateTime.of(1992, 12, 14, 0, 0, 0);
        LocalDateTime now = LocalDateTime.now();

        long hours = ChronoUnit.HOURS.between(localDateTime, now);
        System.out.println("Hours: " + hours);

        long seconds = ChronoUnit.SECONDS.between(localDateTime, now);
        System.out.println("Seconds: " + seconds);

        Period period = Period.between(birthday, today);

        System.out.println(period.getYears() + " years " + period.getMonths() + " months " + period.getDays() + " days ");
    }
}
