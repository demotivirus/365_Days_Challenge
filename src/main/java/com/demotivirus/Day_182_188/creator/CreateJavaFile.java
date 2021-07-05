package com.demotivirus.Day_182_188.creator;

import com.demotivirus.Day_182_188.path.settings.PathCreator;

import java.io.File;
import java.io.IOException;

public class CreateJavaFile {
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
