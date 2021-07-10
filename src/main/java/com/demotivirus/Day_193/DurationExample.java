package com.demotivirus.Day_193;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationExample {
    public static void main(String[] args) {
        LocalTime init = LocalTime.of(6, 30, 0);
        System.out.println(init);

        LocalTime finalTime = init.plus(Duration.ofSeconds(30));
        System.out.println(finalTime);

        long thirty = Duration.between(init, finalTime).getSeconds();
        System.out.println(thirty);
        System.out.println(ChronoUnit.SECONDS.between(init, finalTime));
    }
}
