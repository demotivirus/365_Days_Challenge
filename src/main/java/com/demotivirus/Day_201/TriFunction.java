package com.demotivirus.Day_201;

//interface for create objects with 3 params
public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}
