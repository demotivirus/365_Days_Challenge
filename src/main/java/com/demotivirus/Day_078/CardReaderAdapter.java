package com.demotivirus.Day_078;

public class CardReaderAdapter implements Usb {
    private MemoryCard memoryCard;

    public CardReaderAdapter(MemoryCard memoryCard){
        this.memoryCard = memoryCard;
    }

    @Override
    public void connect() {
        memoryCard.insert();
    }
}
