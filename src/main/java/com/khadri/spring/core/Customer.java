package com.khadri.spring.core;

public class Customer {
    private Order order;

    public Customer(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }
}
