package com.demotivirus.Day_233;

public abstract class AbstractCrudOperationWithArrays {
    public abstract <T> T[] addObject(T[] arr, T obj);
    public abstract <T> T[] deleteLast(T[] arr);
    public abstract <T> T[] resize(T[] arr, int length);
}
