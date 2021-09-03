package com.demotivirus.Day_246;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class FindInBigFile {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/main/java/com/demotivirus/Day_246/chinese.txt");
        System.out.println(countOccurrences(path, "11"));
        System.out.println(countOccurrences(path, "22"));
    }

    private static int countOccurrences(Path path, String text) {
        return countOccurrences(path, text, StandardCharsets.UTF_16);
    }

    private static int countOccurrences(Path path, String text, Charset charset) {
        if (charset == null)
            charset = StandardCharsets.UTF_16;

        int count = 0;

        try (BufferedReader br = Files.newBufferedReader(path, charset)) {
            String line;
            while ((line = br.readLine()) != null) { //not work correctly
                count += countStringInInt(line, text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }

    private static int countStringInInt(String string, String toFind) {
        return string.split(Pattern.quote(toFind), -1).length - 1;
    }
}
