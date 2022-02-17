package com.olsomet.springukeoppgaver.service;

import com.olsomet.springukeoppgaver.model.Amount;
import com.olsomet.springukeoppgaver.model.Currency;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CurrencyService {

    private final List<Currency> list = new ArrayList<>();

    public void loadCurrensies() {
        Currency sek = new Currency("SEK", 0.85);
        Currency usd = new Currency("USD", 8.85);
        Currency eur = new Currency("EUR", 9.56);

        list.add(sek);
        list.add(usd);
        list.add(eur);
    }

    public double calculate(Amount amount) {
        for (Currency currency : list){
            if (amount.getCurrency().equalsIgnoreCase(currency.getCurrency())){
                return amount.getValue() * currency.getRate();
            }
        }
        return 0.0;
    }
}
