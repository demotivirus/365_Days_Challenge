package com.demotivirus.Day_182_184.parser;

import com.demotivirus.Day_182_184.parser.creator.CreateClassWithMethods;
import com.demotivirus.Day_182_184.parser.creator.CreateSimpleClass;

import java.util.LinkedHashMap;
import java.util.Map;

public class CreateTable {
    public void create(String query) {
        String keyString = "CREATE TABLE ";

        int startIndex = keyString.length();
        if (query.toUpperCase().startsWith(keyString)) {
            String textWithoutKeyWord = query.substring(startIndex);
            if (!textWithoutKeyWord.contains("(") || !textWithoutKeyWord.contains(")"))
                CreateSimpleClass.create(textWithoutKeyWord);
            else {
                String[] splitForSpace = textWithoutKeyWord.split(" ");
                String tableName = splitForSpace[0];

                int indexForRemoveTableNameWord = tableName.length();

                String substring2 = textWithoutKeyWord.substring(indexForRemoveTableNameWord)
                        .replaceFirst("[(]", "")
                        //.replace(")", "")
                        .replace(";", "")
                        .trim();
                //.split(",");

                String[] keyValue = substring2.substring(0, substring2.length() - 1)
                        .split(","); //todo 30.06 - not split correctly

                //todo 30.06 - add constructor
                Map<String, String> fieldAndType = new LinkedHashMap<>();
                for (String s : keyValue) {
                    String[] split = s.trim().split(" ");

                    String oldType = split[1];
                    split[1] = ParseOldTypeFieldInNewType.parse(oldType);

                    if (s.contains("references") || s.contains("REFERENCES")) { //todo 30.06 - work this case for ( & )
                        fieldAndType.putIfAbsent(split[0], split[3]); //demo Demo
                    } else {
                        String fieldName = split[0];
                        String fieldTypeWithoutLastBracket = split[1].substring(0, split[1].length());
                        fieldAndType.putIfAbsent(fieldName, fieldTypeWithoutLastBracket); //firstName String
                    }
                }
                CreateClassWithMethods.create(tableName, fieldAndType);
            }
        }
    }
}
