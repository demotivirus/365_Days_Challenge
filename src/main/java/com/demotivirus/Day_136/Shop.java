package com.demotivirus.Day_136;

public class Shop {
    private People people;

    public void buyWhiskey(People people, boolean isAccess) {
        this.people = people;

        if (isAccess) {
            if (people.checkBalance() >= 100) {
                people.divisionMoney(100);
                System.out.println("Thanks for shopping " + people.getName());
            } else sayNotNow();
        } else sayNotNow();
    }

    public void sayNotNow() {
        System.out.println("Not now " + people.getName());
    }
}
