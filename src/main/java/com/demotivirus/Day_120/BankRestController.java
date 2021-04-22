package com.demotivirus.Day_120;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BankRestController {
    @Autowired
    private CurrencyService currencyService;

    @GetMapping("currency")
    public Currency getBankApiByDate(@RequestParam String date){
        Currency currency = currencyService.findByDate(date);
        ResponseEntity<Currency> response;
        if (currency == null){
            RestTemplate restTemplate = new RestTemplate();
            String URL = "https://api.privatbank.ua/p24api/exchange_rates?json&date=" + date;
            //restTemplate.getForObject(URL, String.class);
            response = restTemplate.getForEntity(URL, Currency.class);
            currency = response.getBody();
            currencyService.save(currency);
            return currency;
        }
        else return currency;
    }
}
