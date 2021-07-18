package com.demotivirus.Day_200;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LambdaExample1 {
    public static void main(String[] args) throws IOException {
        String firstLine = processFile(BufferedReader::readLine);
        System.out.println(firstLine + "\n");

        String twoLines = processFile((BufferedReader br) -> br.readLine() + "\n" + br.readLine());
        System.out.println(twoLines);
    }

    private static String processFile(BufferedReaderProcessor brp) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("..\\.\\365_Days_Challenge\\src\\main\\java\\com\\demotivirus\\Day_200\\hello.md"))){
            return brp.process(br);
        }
    }
}
