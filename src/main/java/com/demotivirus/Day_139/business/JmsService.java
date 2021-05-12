package com.demotivirus.Day_139.business;

public class JmsService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task from JMS service");
    }
}
