package com.demotivirus.Day_246;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class ReadBinaryFiles {
    public static void main(String[] args) throws IOException {
        Path binaryFile = Paths.get("src/main/java/com/demotivirus/Day_246/ReadBigFileExample.java");
        int fileSize = (int) Files.readAttributes(binaryFile, BasicFileAttributes.class).size();

        final byte[] buffer = new byte[fileSize];

        try (InputStream is = new FileInputStream(binaryFile.toString())) {
            int i;
            while ((i = is.read(buffer)) != -1) {
                System.out.println("Reading...");
                System.out.println(is.read());
            }
        }
    }
}
