package com.demotivirus.Day_074;

import lombok.Data;

@Data
public class Library {
    private String name;
    private Shelf shelf;

    public Library() {
        this.shelf = new Shelf();
    }

    public Library(String name) {
        this.name = name;
        this.shelf = new Shelf();
    }

    public void putBookOnTheShelf(Book book){
        shelf.add(book);
    }
}
