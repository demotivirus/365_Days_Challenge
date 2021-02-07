package com.demotivirus.Day_048.service;


import com.demotivirus.Day_048.model.Rus;

import java.util.List;

public interface RusService {
    void saveWord(Rus rus);
    Rus updateWord(Rus rus);
    List<Rus> getAllWords();
    Rus getWordById(Long id);
    void deleteWord(Long id);
}
