package com.demotivirus.Day_175.codeGen;

import java.io.File;
import java.io.IOException;

public class SimpleClassCreator {
    public static void create(String className) {


        File file = new File("src/main/java/com/demotivirus/Day_175/generated_classes/" + className + ".java");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
