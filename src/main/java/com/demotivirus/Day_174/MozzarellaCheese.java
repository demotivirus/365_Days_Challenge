package com.demotivirus.Day_174;

public class MozzarellaCheese implements Cheese {
    public MozzarellaCheese() {
        prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("Prepare mozzarella cheese");
    }
}
