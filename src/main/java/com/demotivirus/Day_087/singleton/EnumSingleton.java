package com.demotivirus.Day_087.singleton;

public enum EnumSingleton {
    INSTANCE("CLASS INIT");

    private String info;

    private EnumSingleton(String info){
        this.info = info;
    }

    public EnumSingleton getInstance(){
        return INSTANCE;
    }
}
