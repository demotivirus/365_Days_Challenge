package com.demotivirus.Day_177;

import java.io.File;
import java.io.IOException;

public class SimpleClassCreator {
    public static void create(String className) {
        PathCreator.getDefaultPath();
        File file = new File(  PathCreator.getDefaultPath() + className + ".java");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
