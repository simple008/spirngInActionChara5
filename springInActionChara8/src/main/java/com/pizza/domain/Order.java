package com.pizza.domain;

import java.util.List;

public class Order {
    private static final long serialVersionUID = 1L;
    private Customer customer;
    private List<Pizza> pizzas;
    private Payment payment;
}
