package com.demotivirus.Day_170;

public class Main {
    public static void main(String[] args) {
        GlobalFactoryCreator factoryCreator = new GlobalFactoryCreator();
        GlobalFactory factory = factoryCreator.create("dates");
        //Dates iraq = DatesFactory.create("iraq");
        Dates iran = factoryCreator.create("dates").createDates("iran");

        DriedApples russian = factoryCreator.create("dates").createDriedApples("russian");
        russian.printName(); // BUG HERE O_o
    }
}
