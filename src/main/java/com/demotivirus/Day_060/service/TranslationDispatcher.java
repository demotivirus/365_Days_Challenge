package com.demotivirus.Day_060.service;

import com.demotivirus.Day_060.model.Eng;
import com.demotivirus.Day_060.model.Rus;

import java.util.List;

public interface TranslationDispatcher {
    List<String> findAllEngToRusTranslations(Long engId);
    List<String> findAllRusToEngTranslations(Long rusId);

    Eng findFirstEngByWord(String word);
    Rus findFistRusByWord(String word);
}
