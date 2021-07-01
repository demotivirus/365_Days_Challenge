package com.demotivirus.Day_182_184.util;

import com.demotivirus.Day_182_184.path.settings.PathCreator;

import java.io.File;
import java.io.IOException;

public class ClassCreator {
    public static void create(String className) {
        PathCreator pathCreator = new PathCreator();
        File file = new File(  pathCreator.getPath() + className + ".java");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
