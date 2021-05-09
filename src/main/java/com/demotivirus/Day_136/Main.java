package com.demotivirus.Day_136;

public class Main {
    public static void main(String[] args) {
        Club club = new Club();

        People leon = PeopleFactory.createPeople("Leon", 11);
        People thom = PeopleFactory.createPeople("Thom", 24);
        thom.setMoney(new Money(1000));

        club.checkAge(leon);
        club.checkAge(thom);

        System.out.println(thom);
        club.buyWhiskey(thom);
        System.out.println(thom.getMoney());

        for (int i = 0; i < 15; i++) {
            club.buyWhiskey(thom);
        }

        System.out.println(thom.getMoney());
    }
}
