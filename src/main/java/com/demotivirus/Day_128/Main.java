package com.demotivirus.Day_128;

public class Main {
    public static void main(String[] args) {
        AbstractCustomer one = new CustomerFactory().getCustomer("Rob");
        AbstractCustomer two = new CustomerFactory().getCustomer("Mark");
        AbstractCustomer three = new CustomerFactory().getCustomer("Nana");
        AbstractCustomer four = new CustomerFactory().getCustomer("Lusy");
        AbstractCustomer five = new CustomerFactory().getCustomer("Peter");

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
    }
}
