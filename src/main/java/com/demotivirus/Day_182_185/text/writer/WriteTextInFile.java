package com.demotivirus.Day_182_185.text.writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteTextInFile {
    public static void write(File file, String generatingText) {
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw))
        {
            out.println(generatingText);
            out.flush();
        }
        catch (IOException e) {
            //exception handling left as an exercise for the reader
        }
    }
}
