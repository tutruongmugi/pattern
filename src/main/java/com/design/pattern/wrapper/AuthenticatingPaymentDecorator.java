package com.design.pattern.wrapper;

import com.design.pattern.service.PaymentStrategy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class AuthenticatingPaymentDecorator implements PaymentStrategy {

    private final PaymentStrategy paymentStrategy;

    @Override
    public void pay(int amount) {
        log.info("AuthenticatingPaymentDecorator");
        paymentStrategy.pay(amount);
    }
}
