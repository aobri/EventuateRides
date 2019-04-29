package com.aobri.eventuaterides.rides.common.customer;

public class CustomerRatedEvent implements CustomerEvent {

    private String customerId;
    private Integer rating;

    public CustomerRatedEvent(String customerId, Integer rating) {
        this.customerId = customerId;
        this.rating = rating;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Integer getRating() {
        return rating;
    }
}
