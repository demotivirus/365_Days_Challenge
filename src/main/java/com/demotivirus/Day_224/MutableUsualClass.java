package com.demotivirus.Day_224;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MutableUsualClass {
    private int start;
    private int end;

    public MutableUsualClass getImmutableClass() {
        MutableUsualClass clone = new MutableUsualClass();
        clone.setStart(start);
        clone.setEnd(end);

        return clone;
    }
}
