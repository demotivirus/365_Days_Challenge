package com.demotivirus.Day_227;

public class TimeForDate {
    public static void main(String[] args) {
        CalculateDays calculator = new CalculateDaysImpl();

        calculator.calculateTimeForDate("2045-01-01");
        calculator.calculateTimeForNow("1972-10-16");
        calculator.calculateTimeForDeath(70, "1972-10-16");
    }
}
