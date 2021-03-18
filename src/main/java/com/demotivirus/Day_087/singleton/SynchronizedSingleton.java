package com.demotivirus.Day_087.singleton;

public class SynchronizedSingleton {
    private static volatile SynchronizedSingleton instance;

    private SynchronizedSingleton(){}

    public static SynchronizedSingleton getInstance(){
        SynchronizedSingleton local = instance;
        if (local == null){
            synchronized (SynchronizedSingleton.class){
                local = instance;
                if (local == null)
                    instance = new SynchronizedSingleton();
            }
        }
        return instance;
    }
}