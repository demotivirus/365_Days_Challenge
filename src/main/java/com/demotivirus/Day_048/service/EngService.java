package com.demotivirus.Day_048.service;

import com.demotivirus.Day_048.model.Eng;

import java.util.List;

public interface EngService {
    void saveWord(Eng eng);
    Eng updateWord(Eng eng);
    List<Eng> getAllWords();
    Eng getWordById(Long id);
    void deleteWord(Long id);
}
