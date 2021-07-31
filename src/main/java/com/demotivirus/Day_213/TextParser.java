package com.demotivirus.Day_213;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextParser {
    public String parse(String path) {
        File file = new File(path);
        StringBuilder sb = new StringBuilder();
        try (Scanner scn = new Scanner(file)) {
            while(scn.hasNextLine())
                sb.append(scn.nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
