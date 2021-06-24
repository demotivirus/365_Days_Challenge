package com.demotivirus.Day_178;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("""
                USE --help for menu""");
        readMenu(scn);
    }

    private static void readMenu(Scanner scn) {
        Menu menu = new Menu();
        menu.readMenu(scn);
    }
}
