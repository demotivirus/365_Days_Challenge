package com.demotivirus.Day_238;

import java.io.File;

public class RelativePath {
    public static void main(String[] args) {
        File file = new File("demotivirus\\Day_238\\test\\testFile.txt"); //relative path don't start with /
        System.out.println(file.getAbsolutePath());
    }
}
