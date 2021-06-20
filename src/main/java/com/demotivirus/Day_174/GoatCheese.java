package com.demotivirus.Day_174;

public class GoatCheese implements Cheese {
    public GoatCheese() {
        prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("Prepare goat cheese");
    }
}
