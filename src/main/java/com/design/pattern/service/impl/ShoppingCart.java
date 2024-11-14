package com.design.pattern.service.impl;

import com.design.pattern.service.PaymentStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ShoppingCart {
    private final Map<String, PaymentStrategy> paymentStrategies;

    public void checkout(String paymentMethod, int amount) {
        PaymentStrategy strategy = Optional.ofNullable(paymentStrategies.get(paymentMethod)).orElseThrow(IllegalArgumentException::new);
        strategy.pay(amount);
    }
}
