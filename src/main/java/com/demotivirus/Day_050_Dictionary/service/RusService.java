package com.demotivirus.Day_050_Dictionary.service;


import com.demotivirus.Day_050_Dictionary.model.Eng;
import com.demotivirus.Day_050_Dictionary.model.Rus;

import java.util.List;

public interface RusService {
    void saveWord(Rus rus);
    Rus updateWord(Rus rus);
    List<Rus> getAllWords();
    Rus getWordById(Long id);
    void deleteWord(Long id);
    void saveEngTranslation(Rus rus, Eng eng);
}
