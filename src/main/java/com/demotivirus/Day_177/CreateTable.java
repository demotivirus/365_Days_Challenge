package com.demotivirus.Day_177;

public class CreateTable {
    public static void create(String query) {
        String keyString = "CREATE TABLE ";
        int startIndex = keyString.length();
        if (query.toUpperCase().startsWith(keyString)) {
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
