package com.demotivirus.Day_179;

import java.io.File;
import java.io.IOException;

public class SimpleClassCreator {
    public void create(String className) {
        PathCreator pathCreator = new PathCreator();
        File file = new File(  pathCreator.getPath() + className + ".java");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
