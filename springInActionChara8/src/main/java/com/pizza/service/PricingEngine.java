package com.pizza.service;

import com.pizza.domain.Order;

public interface PricingEngine {
    float calculateOrderTotal(Order order);
}
