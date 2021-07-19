package com.demotivirus.Day_202;

public class Main {
    public static void main(String[] args) {
        Board board = new Board("My text board");
        SectionName draft = new SectionName("Draft");
        board.addSection(draft);
        System.out.println(board);

        Sticker sticker = new Sticker.Builder().setTitle("New sticker").build();
        board.addSticker(draft, sticker);
        System.out.println(board);
    }
}
