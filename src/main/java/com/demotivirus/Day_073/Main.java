package com.demotivirus.Day_073;

public class Main {
    public static void main(String[] args) {
        Rows rows = new Rows();
        rows.println("sdfsdf");
        rows.println("sdgdfdf");

        Cat vasilij = new Cat();
        vasilij.love("fish");
        System.out.println(vasilij);
        vasilij.love("milk");
        System.out.println(vasilij);
        vasilij.hate("buckwheat");
        System.out.println(vasilij);

        CashFinalClass ten = new CashFinalClass(10);
        ten.mult(50);
        System.out.println(ten);
        CashFinalClass fiveHundred = ten.mult(50);
        System.out.println(fiveHundred);

        Cash price = new Cash(25, 99);
        System.out.println(price);
        price = new Cash(29, 99);
        System.out.println(price);
    }
}
