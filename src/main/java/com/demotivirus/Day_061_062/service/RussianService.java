package com.demotivirus.Day_061_062.service;

import com.demotivirus.Day_061_062.model.Russian;

import java.util.List;

public interface RussianService extends GlobalService{
    //Russian findByWord(String word);
    List<Russian> findAll();
}
