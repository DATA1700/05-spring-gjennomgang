package com.olsomet.springukeoppgaver.controller;

import com.olsomet.springukeoppgaver.model.Amount;
import com.olsomet.springukeoppgaver.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

    @Autowired
    CurrencyService service;

    @PostMapping("/load")
    public void load(){
        service.loadCurrensies();
    }

    @GetMapping("/calc")
    public double calculate(Amount amount){
        return service.calculate(amount);
    }
}
