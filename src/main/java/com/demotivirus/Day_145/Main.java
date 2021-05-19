package com.demotivirus.Day_145;

public class Main {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service 1");
        service.execute();
        System.out.println();

        service = ServiceLocator.getService("Service 2");
        service.execute();
        System.out.println();

        service = ServiceLocator.getService("Service 1");
        service.execute();
        System.out.println();

        service = ServiceLocator.getService("Service 2");
        service.execute();
    }
}
