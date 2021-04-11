package com.demotivirus.Day_110;

public class Stock {
    private String name = "Boots";
    private int nums = 10;

    public void buy(){
        System.out.println("On stock: " + name + " nums: " + nums + " buy");
    }

    public void sell(){
        System.out.println("On stock: " + name + " nums: " + nums + " sold");
    }
}
