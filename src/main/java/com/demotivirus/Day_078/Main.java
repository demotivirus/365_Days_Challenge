package com.demotivirus.Day_078;

public class Main {
    public static void main(String[] args) {
        Usb usb = new CardReaderAdapter(new MemoryCard());
        usb.connect();

        Smartphone smartphone = new SmartphoneToFlashAdapter(new FlashCard());
        smartphone.connect();
    }
}
