package com.demotivirus.Day_157;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday" };

        Function<Integer, String> getDaysOfWeek = getWeekDay(weekDays);
        System.out.println(getDaysOfWeek.apply(5));
    }

    private static Function<Integer, String> getWeekDay(String[] weekDays) {
        return x -> x >= 0 ? weekDays[x % 7] : null;
    }
}
