package com.demotivirus.Day_073.feel;

import com.demotivirus.Day_073.eat.Eat;
import com.demotivirus.Day_073.eat.EatFactory;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Dislike implements Feel{
    private List<Eat> eats = new ArrayList<>();

    @Override
    public void setEat(String eat) {
        eats.add(EatFactory.factory(eat));
    }
}
