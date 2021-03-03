package com.demotivirus.Day_072;

import lombok.ToString;

@ToString
public class Bakery {
    //private Drink drink;

    public Drink cupOfCoffee(String nameOfDrink){
        return new Coffee(nameOfDrink).cup();
    }
}
