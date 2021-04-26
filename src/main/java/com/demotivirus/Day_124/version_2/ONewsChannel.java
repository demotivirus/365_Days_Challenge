package com.demotivirus.Day_124.version_2;

import lombok.Data;

import java.util.Observable;
import java.util.Observer;

@Data
public class ONewsChannel implements Observer {
    private String news;

    @Override
    public void update(Observable o, Object news) {
        this.setNews((String) news);
    }
}
