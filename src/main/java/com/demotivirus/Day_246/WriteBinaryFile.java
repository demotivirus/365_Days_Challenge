package com.demotivirus.Day_246;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;

public class WriteBinaryFile {
    public static void main(String[] args) throws IOException {
        Path binaryFile = Paths.get("src/main/java/com/demotivirus/Day_246/ReadBigFileExample.java");
        int fileSize = (int) Files.readAttributes(binaryFile, BasicFileAttributes.class).size();

        final byte[] buffer = new byte[fileSize];

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
                Files.newOutputStream(binaryFile, StandardOpenOption.CREATE,
                StandardOpenOption.WRITE));
        bufferedOutputStream.write(buffer);
    }
}
