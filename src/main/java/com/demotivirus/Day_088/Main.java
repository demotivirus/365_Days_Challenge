package com.demotivirus.Day_088;

public class Main {
    public static void main(String[] args) {
        Home home = new Home();
        home.addHuman(new Human("Patrick"));
        home.addHuman(new Human("Erick"));

        Flat flat = new Flat();
        flat.addHuman(new Human("Alone"));

        CityComposite cityComposite = new CityComposite();
        cityComposite.add(home);
        cityComposite.add(flat);

        cityComposite.printInfo();
    }
}
