package com.demotivirus.Day_224;

import lombok.Getter;

@Getter
public final class ImmutableClass {
    private final double x;
    private final double y;
    private final MutableUsualClass mutableUsualClass;

    //incorrect because class is now is mutable
//    public ImmutableClass(double x, double y, MutableUsualClass mutableUsualClass) {
//        this.x = x;
//        this.y = y;
//        this.mutableUsualClass = mutableUsualClass;
//    }


    //correct constructor - see also getters in MutableUsualClass!
    public ImmutableClass(double x, double y, MutableUsualClass mutableUsualClass) {
        this.x = x;
        this.y = y;

        MutableUsualClass clone = new MutableUsualClass(); //safe immutable in class
        MutableUsualClass immutableClass = mutableUsualClass.getImmutableClass(); //clone mutable class too!
        clone.setStart(immutableClass.getStart());
        clone.setEnd(immutableClass.getEnd());

        this.mutableUsualClass = clone;
    }
}
