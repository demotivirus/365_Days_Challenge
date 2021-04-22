package com.demotivirus.Day_120;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CurrencyServiceImpl implements CurrencyService {
    @Autowired
    private CurrencyDao currencyDao;

    @Override
    public void save(Currency currency) {
        currencyDao.save(currency);
    }

    @Override
    public Currency findByDate(String date) {
        return currencyDao.findByDate(date);
    }
}
