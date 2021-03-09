package com.demotivirus.Day_078;

public class SmartphoneToFlashAdapter implements Smartphone {
    private FlashCard flashCard;

    public SmartphoneToFlashAdapter(FlashCard flashCard){
        this.flashCard = flashCard;
    }

    @Override
    public void connect() {
        flashCard.insert();
    }
}
