package com.demotivirus.Day_070;

//From book Elegant Objects
public class ElegantObjects_BOOK {
    public static void main(String[] args) {
        System.out.println(RandomNumbers.getRandomInt());

        Cash cash = new Cash(300, "USD");
        System.out.println(cash);
        cash = new Cash("300");
        System.out.println(cash);

        User user = new User();
        user.setUserName(new UserName("Mikle", "Miklovich", "Philips"));
        System.out.println(user.getUserName().getFirstName());

        NewCash newCash = new NewCash("600");
        System.out.println(newCash);

        Number number = new CashedNum("600");
        System.out.println(number.intValue());
        System.out.println(number.intValue()); //THIS VALUE FROM CACHE
    }
}
