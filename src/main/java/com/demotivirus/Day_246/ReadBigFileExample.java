package com.demotivirus.Day_246;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;

public class ReadBigFileExample {
    public static void main(String[] args) throws IOException {
        Path chinese = Path.of("src/main/java/com/demotivirus/Day_246/chinese.txt");
//        List<String> allLines = Files.readAllLines(chinese, StandardCharsets.UTF_16);
//        allLines.forEach(System.out::println);

        int MAP_SIZE = 524880; //5 MB
        try (FileChannel fileChannel = (FileChannel.open(chinese, EnumSet.of(StandardOpenOption.READ)))) {
            int position = 0;
            long length = fileChannel.size();

            while (position < length) {
                long remaining = length - position;
                int bytesToMap = (int) Math.min(MAP_SIZE, remaining);

                MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, position, bytesToMap);
                //to do

                position += bytesToMap;
            }
        }
    }
}
