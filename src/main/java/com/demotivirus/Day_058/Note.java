package com.demotivirus.Day_058;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Note {
    @NonNull
    private String title;

    @NonNull
    private String note;
}
