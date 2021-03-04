package com.demotivirus.Day_073;

import com.demotivirus.Day_073.feel.Dislike;
import com.demotivirus.Day_073.feel.Feel;
import com.demotivirus.Day_073.feel.Like;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Cat {
    private List<Feel> feels = new ArrayList<>();

    public void love(String nameOfFood) {
        Like like = new Like();
        like.setEat(nameOfFood);
        feels.add(like);
    }

    public void hate(String nameOfFood){
        Dislike dislike = new Dislike();
        dislike.setEat(nameOfFood);
        feels.add(dislike);
    }
}
