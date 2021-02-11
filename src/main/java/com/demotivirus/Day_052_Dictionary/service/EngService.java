package com.demotivirus.Day_052_Dictionary.service;

import com.demotivirus.Day_052_Dictionary.model.Eng;
import com.demotivirus.Day_052_Dictionary.model.Rus;

import java.util.List;

public interface EngService {
    void saveWord(Eng eng);
    Eng updateWord(Eng eng);
    List<Eng> getAllWords();
    Eng getWordById(Long id);
    void deleteWord(Long id);
    void saveEngTranslation(Eng eng, Rus rus);
}
