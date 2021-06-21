package com.demotivirus.Day_175.codeGen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StringBuilder query = new StringBuilder();

        System.out.print("ENTER QUERY: ");
        if (scn.hasNextLine()) {
            query.append(scn.nextLine());
        }

        String keyString = "CREATE TABLE ";
        int startIndex = keyString.length();
        if (query.toString().startsWith(keyString)) {
            String substring = query.substring(startIndex, query.length());

            String[] split = substring.split(" ");
            for (int i = 0; i < split.length; i++) {
                if (split.length == 1) {
                    String stringWithoutLastSymbol = substring.substring(0, substring.length() - 1);

                    SimpleClassCreator.create(stringWithoutLastSymbol);
                    TextCodeGenerator.generate(stringWithoutLastSymbol);

                    System.out.println(stringWithoutLastSymbol + " - GENERATE SUCCESS");
                }
            }
        }
    }
}
