package com.design.pattern.controller;

import com.design.pattern.service.impl.ShoppingCart;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class StrategyController {

    private final ShoppingCart shoppingCart;

    @GetMapping("testStrategy")
    public ResponseEntity<?> testStrategy() {
        shoppingCart.checkout("paypalPayment", 100);
        return ResponseEntity.ok().body("Hello World");
    }
}
