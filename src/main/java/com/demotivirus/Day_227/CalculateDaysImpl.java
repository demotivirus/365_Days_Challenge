package com.demotivirus.Day_227;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class CalculateDaysImpl implements CalculateDays {
    @Override
    public void calculateTimeForNow(String date) {
        System.out.println("=========TIME FOR NOW=========");
        calculate(date, LocalDateTime.now().toString());
    }

    @Override
    public void calculateTimeForDate(String date) {
        System.out.println("=========TIME FOR DATE=========");
        calculate(LocalDateTime.now().toString(), date);
    }

    @Override
    public void calculateTimeForDeath(int timeToEnd, String startDateOrYouAge) {
        System.out.println("=========TIME FOR DEATH=========");

        LocalDateTime birthDate = LocalDate.parse(startDateOrYouAge).atStartOfDay();
        LocalDateTime timeToEndDate = birthDate.plus(timeToEnd, ChronoUnit.YEARS);

        calculate(LocalDateTime.now(), timeToEndDate);
    }

    private void calculate(String firstDate, String secondDate) {
        LocalDateTime start;
        LocalDateTime now;
        try {
            start = LocalDate.parse(firstDate).atStartOfDay(); //convert LocalDate to LocalDateTime
            now = LocalDateTime.parse(secondDate);
        } catch (DateTimeParseException ex) { //if exception - switch dates
            start = LocalDateTime.parse(firstDate);
            now = LocalDate.parse(secondDate).atStartOfDay();
        }

        calculate(start, now);
    }

    private void calculate(LocalDateTime start, LocalDateTime now) {
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

        long minutes = ChronoUnit.MINUTES.between(start, now);
        System.out.println("Minutes: " + minutes);

        long seconds = ChronoUnit.SECONDS.between(start, now);
        System.out.println("Seconds: " + seconds);
    }
}
