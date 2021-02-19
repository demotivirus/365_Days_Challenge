package com.demotivirus.Day_060.service;

import com.demotivirus.Day_060.model.Rus;

import java.util.List;

public interface RusService {
    void saveWord(Rus rus);
    void updateWord(Rus rus);
    List<Rus> getAllWords();
    Rus getById(Long id);
    void deleteWord(Long id);
    //void saveEngTranslation(Rus rus, Eng eng);
    void saveEngTranslation(Rus rus);
    //Rus findByWord(String word);
    Long findIdByWord(String word);
    List<String> findAllRusToEngTranslations(Long id);
}
