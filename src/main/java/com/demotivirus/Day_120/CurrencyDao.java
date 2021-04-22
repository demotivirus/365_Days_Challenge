package com.demotivirus.Day_120;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyDao extends JpaRepository<Currency, Long> {
    Currency findByDate(String date);
}
