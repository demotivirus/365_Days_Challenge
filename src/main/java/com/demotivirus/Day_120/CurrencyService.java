package com.demotivirus.Day_120;

public interface CurrencyService {
    void save(Currency currency);
    Currency findByDate(String date);
}
