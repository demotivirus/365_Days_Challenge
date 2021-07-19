package com.demotivirus.Day_202;

import lombok.Data;

@Data
public class StickerNumber {
    private static int number = 0;

    public static void increment() {
        number += 1;
    }
}
