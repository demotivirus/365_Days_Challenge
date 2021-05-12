package com.demotivirus.Day_139.business;

public class EjbService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task from EJB service");
    }
}
