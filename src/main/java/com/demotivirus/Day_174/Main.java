package com.demotivirus.Day_174;

public class Main {
    public static void main(String[] args) {
        GourmetToppingFactory gourmet = new GourmetToppingFactory();
        Cheese cheese = gourmet.createCheese();
        Sauce sauce = gourmet.createSauce();

        System.out.println(gourmet);
    }
}
