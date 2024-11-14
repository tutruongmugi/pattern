package com.design.pattern.service.impl;

import com.design.pattern.service.PaymentStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        log.info("pay credit card");
    }
}
