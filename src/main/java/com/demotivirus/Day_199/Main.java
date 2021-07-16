package com.demotivirus.Day_199;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Cost cost = new Cost();
        System.out.println("Enter cost (double): ");
        if (scn.hasNextLine()) {
            cost.setMoney(scn.nextDouble());
        }
        System.out.println("Enter the time (minutes): ");
        if (scn.hasNextLine()) {
            cost.setTime(LocalTime.of(0, 0).plus(scn.nextInt(), ChronoUnit.MINUTES));
        }
        findTransport(cost);
    }

    private static void findTransport(Cost cost) {
        if (cost.getMoney() < 500)
            new TravelByBus().goToRailwayStation();
        else new TravelByAuto().goToRailwayStation();
    }
}
