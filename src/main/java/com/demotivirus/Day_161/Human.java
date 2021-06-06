package com.demotivirus.Day_161;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
public class Human {
    @Getter @Setter
    private String name;
    private List<Book> booksForReading = new ArrayList<>();

    public Human(String name) {
        this.name = name;
    }

    public void addBookForPersonaReading(Book book) {
        booksForReading.add(book);
    }
}
