package com.demotivirus.Day_223;

public class MyObjects {
    public static <T> T requireNotNullOrElseIAE(T obj, String message) {
        if (obj == null)
            throw new IllegalArgumentException(message);
        return obj;
    }



    public static <T, X extends Throwable> T requireNotNullOrElseThrow(T obj, X exception) throws X {
        if (obj != null)
            return obj;
        else throw exception;
    }
}
