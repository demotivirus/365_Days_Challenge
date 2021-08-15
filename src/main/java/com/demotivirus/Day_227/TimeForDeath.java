package com.demotivirus.Day_227;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TimeForDeath {
    public static void main(String[] args) {
        System.out.println("How many years do you plan to live?");
        printTimeForDeath("2000-12-15");
    }

    private static void printTimeForDeath(String date) {
        LocalDateTime start = LocalDate.parse(date).atStartOfDay(); //convert LocalDate to LocalDateTime
        LocalDateTime now = LocalDateTime.now();

        long years = ChronoUnit.YEARS.between(start, now);
        System.out.println("Years: " + years);

        long months = ChronoUnit.MONTHS.between(start, now);
        System.out.println("Months: " + months);

        long weeks = ChronoUnit.WEEKS.between(start, now);
        System.out.println("Weeks: " + weeks);

        long days = ChronoUnit.DAYS.between(start, now);
        System.out.println("Days: " + days);

        long hours = ChronoUnit.HOURS.between(start, now);
        System.out.println("Hours: " + hours);

        long seconds = ChronoUnit.SECONDS.between(start, now);
        System.out.println("Seconds: " + seconds);
    }
}
