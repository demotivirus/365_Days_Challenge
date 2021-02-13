package com.demotivirus.Day_053_054.service;


import com.demotivirus.Day_053_054.model.Rus;

import java.util.List;

public interface RusService {
    void saveWord(Rus rus);
    Rus updateWord(Rus rus);
    List<Rus> getAllWords();
    Rus getRusById(Long id);
    void deleteWord(Long id);
    //void saveEngTranslation(Rus rus, Eng eng);
    void saveEngTranslation(Rus rus);
    //Rus findByWord(String word);
    Long findIdByWord(String word);
    List<String> findAllEngWordsByRusId(Long id);
}
