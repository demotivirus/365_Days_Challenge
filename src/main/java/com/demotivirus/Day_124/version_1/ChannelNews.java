package com.demotivirus.Day_124.version_1;

import lombok.Data;

@Data
public class ChannelNews implements Channel{
    private String news;

    @Override
    public void update(Object o) {
        this.setNews((String) o);
    }
}
