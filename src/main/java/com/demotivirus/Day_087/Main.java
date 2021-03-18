package com.demotivirus.Day_087;

import com.demotivirus.Day_087.singleton.EnumSingleton;
import com.demotivirus.Day_087.singleton.Singleton;
import com.demotivirus.Day_087.singleton.SynchronizedSingleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton == singleton2);

        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        System.out.println(enumSingleton == enumSingleton2);

        SynchronizedSingleton synchronizedSingleton = SynchronizedSingleton.getInstance();
        SynchronizedSingleton synchronizedSingleton2 = SynchronizedSingleton.getInstance();

        System.out.println(synchronizedSingleton == synchronizedSingleton2);
    }
}
