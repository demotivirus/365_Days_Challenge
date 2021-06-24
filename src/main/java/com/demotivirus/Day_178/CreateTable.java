package com.demotivirus.Day_178;

public class CreateTable {
    public void create(String query) {
        SimpleClassCreator simpleClassCreator = new SimpleClassCreator();
        TextCodeGenerator textCodeGenerator = new TextCodeGenerator();
        String keyString = "CREATE TABLE ";

        int startIndex = keyString.length();
        if (query.toUpperCase().startsWith(keyString)) {
            String substring = query.substring(startIndex, query.length());

            String[] split = substring.split(" ");
            for (int i = 0; i < split.length; i++) {
                if (split.length == 1) {
                    String stringWithoutLastSymbol = substring.substring(0, substring.length() - 1);
                    simpleClassCreator.create(stringWithoutLastSymbol);
                    textCodeGenerator.generate(stringWithoutLastSymbol);
                }
            }
        }
    }
}
