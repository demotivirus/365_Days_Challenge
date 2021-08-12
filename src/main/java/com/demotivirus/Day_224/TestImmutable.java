package com.demotivirus.Day_224;

public class TestImmutable {
    public static void main(String[] args) {
        MutableUsualClass mutable = new MutableUsualClass();
        mutable.setStart(0);
        mutable.setEnd(15);

        ImmutableClass immutableClass = new ImmutableClass(1.54, 2.68, mutable);
        System.out.println(immutableClass.getMutableUsualClass().getStart());

        mutable.setStart(15);
        System.out.println(immutableClass.getMutableUsualClass().getStart());
    }
}
