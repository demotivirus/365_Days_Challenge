package com.demotivirus.Day_070;

import lombok.ToString;

@ToString
public class Cash {
    private int money;
    private String moneyName;

    public Cash(int money){
        this.money = money;
    }

    public Cash(double money){
        this((int) money);
    }

    public Cash(float money){
        this((int) money);
    }

    public Cash(String money){
        this(Cash.parse(money));
    }

    public Cash(int money, String moneyName){
        this.money = money;
        this.moneyName = moneyName;
    }

    public static int parse(String money){
        return Integer.parseInt(money);
    }
}
