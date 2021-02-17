package com.demotivirus.Day_002_S2;

import lombok.Data;
import lombok.NonNull;

@Data
public class Book {
    @NonNull
    private Author author;

    @NonNull
    private String title;
}
