package com.demotivirus.Day_125;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        State start = new StartState();
        start.doAction(context);
        System.out.println(context.getState());

        System.out.println("========================");

        State end = new EndState();
        end.doAction(context);
        System.out.println(context.getState());
    }
}
