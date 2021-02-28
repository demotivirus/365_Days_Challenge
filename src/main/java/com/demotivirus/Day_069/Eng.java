package com.demotivirus.Day_069;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data @NoArgsConstructor
public class Eng extends AbstractLanguage{
    public Eng(@NonNull String word) {
        super(word);
    }


}
