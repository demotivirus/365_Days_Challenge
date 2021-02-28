package com.demotivirus.Day_069;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data @NoArgsConstructor @RequiredArgsConstructor
public abstract class AbstractLanguage extends AbstractTranslations{
    @NonNull
    private String word;
}
