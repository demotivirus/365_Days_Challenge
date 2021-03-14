package com.demotivirus.Day_083;

public class Main {
    public static void main(String[] args) {
        LittleBox littleBox = new LittleBox();
        littleBox.add("Handcuffs");
        littleBox.add("Watch");

        LargeBox largeBox = new LargeBox();
        largeBox.add("Refrigerator");

        Machine machine = new Machine();
        machine.add(largeBox);
        machine.add(littleBox);
        machine.add(largeBox);
        machine.add(largeBox);

        machine.printNumOfThings();
    }
}
