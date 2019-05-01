package com.aobri.eventuaterides.customers.customerscommon;

public class AddCustomerCreditResponse {

    private String customerId;
    private String name;
    private Integer newCredit;

    public AddCustomerCreditResponse() {
    }

    public AddCustomerCreditResponse(String customerId, String name, Integer newCredit) {
        this.customerId = customerId;
        this.name = name;
        this.newCredit = newCredit;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public Integer getNewCredit() {
        return newCredit;
    }
}
