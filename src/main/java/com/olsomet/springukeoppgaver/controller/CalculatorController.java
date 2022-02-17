package com.olsomet.springukeoppgaver.controller;

import com.olsomet.springukeoppgaver.service.CalculatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    CalculatorService service;

    private final Logger logger = LoggerFactory.getLogger(CalculatorController.class);

    @GetMapping("/add")
    public double add(double num1, double num2) {
        try {
            return service.add(num1, num2);
        } catch (Exception e) {
            logger.error("Feil i adderingen : " + e);
            return 0.0;
        }
    }

    @GetMapping("/sub")
    public double sub(double num1, double num2) {
        try {
            return service.sub(num1, num2);
        } catch (Exception e) {
            logger.error("Feil i subtraksjonen : " + e);
            return 0.0;
        }

    }

    @GetMapping("/mul")
    public double mul(double num1, double num2) {
        try {
            return service.mul(num1, num2);
        } catch (Exception e) {
            logger.error("Feil i multipliseringen : " + e);
            return 0.0;
        }
    }

    @GetMapping("/div")
    public double div(double num1, double num2) {
        try {
            return service.div(num1, num2);
        } catch (Exception e) {
            logger.error("Feil i divideringen : " + e);
            return 0.0;
        }
    }
}
