package com.aobri.eventuate.rides.customerscommon;

public class CreateCustomerResponse {
    private String customerId;

    public CreateCustomerResponse() {
    }

    public CreateCustomerResponse(String customerId) {
        this.customerId = customerId;

    }

    public String getCustomerId() {
        return customerId;
    }
}
