package com.demotivirus.Day_197;

import java.io.File;
import java.io.FileFilter;

public class LambdaExample1 {
    public static void main(String[] args) {
        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isHidden();
            }
        });

        File[] hiddenFilesLambda = new File(".").listFiles(File::isHidden);


    }
}
