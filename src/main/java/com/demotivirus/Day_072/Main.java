package com.demotivirus.Day_072;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setSalary(new DefaultCash(100));
        System.out.println(employee);

        Bakery bakery = new Bakery();
        System.out.println(bakery.cupOfCoffee("Latte"));
    }
}
