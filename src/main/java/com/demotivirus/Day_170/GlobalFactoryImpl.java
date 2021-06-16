package com.demotivirus.Day_170;

public abstract class GlobalFactoryImpl implements GlobalFactory {
    public Dates createDates(String name) {
        if (name.equalsIgnoreCase("iran dates") || name.equalsIgnoreCase("iran"))
            return new IranDates();
        else return new IraqDates();
    }

    public DriedApples createDriedApples(String name) {
        if (name.equalsIgnoreCase("russian apples") || name.equalsIgnoreCase("russian"))
            return new RussianDriedApples();
        else return new UkraineDriedApples();
    }
}
