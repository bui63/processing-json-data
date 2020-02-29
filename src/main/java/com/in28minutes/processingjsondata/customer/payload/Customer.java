package com.in28minutes.processingjsondata.customer.payload;

import java.util.List;

public class Customer {
    private Long id;
    private String name;
    private List<String> paymentMethods;

    public Customer(Long id, String name, List<String> paymentMethods) {
        this.id = id;
        this.name = name;
        this.paymentMethods = paymentMethods;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(List<String> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }
}
