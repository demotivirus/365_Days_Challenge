package com.demotivirus.Day_074;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Book {
    @NonNull
    private String title;
    @NonNull
    private String author;
}
