package com.demotivirus.Day_069;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public abstract class AbstractTranslations {
    private List<Eng> engWords = new ArrayList<>();
    private List<Rus> rusWords = new ArrayList<>();

    public void addEngWord(Eng eng){
        engWords.add(eng);
    }

    public void getAllEngWords(){
        for (Eng e : engWords)
            System.out.println(e);
    }

    public void addRusWord(Rus rus){
        rusWords.add(rus);
    }
}
