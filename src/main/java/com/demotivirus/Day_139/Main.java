package com.demotivirus.Day_139;

public class Main {
    public static void main(String[] args) {
        BusinessClient businessClient = new BusinessClient(new BusinessDelegate("EJB"));
        businessClient.doTask();

        businessClient = new BusinessClient(new BusinessDelegate("JMS"));
        businessClient.doTask();
    }
}
