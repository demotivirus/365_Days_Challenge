package com.demotivirus.Day_246;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteTextFile {
    private static Logger LOGGER = Logger.getLogger(WriteTextFile.class.getName());
    public static void main(String[] args) {
        Path textFile = Paths.get("written-file.txt");

        try (BufferedWriter bw = Files.newBufferedWriter(textFile, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            bw.write("Code everyday for be harder");
            bw.newLine();
            bw.write("Repeat ten if you not understand");
        } catch (IOException ex) {
            LOGGER.log(Level.WARNING, "Something wos wrong {}", ex.getMessage());
        }
    }
}
