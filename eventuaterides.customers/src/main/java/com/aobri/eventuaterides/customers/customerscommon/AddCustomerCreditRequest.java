package com.aobri.eventuaterides.customers.customerscommon;

public class AddCustomerCreditRequest {

    private String customerId;
    private Integer additionalCredit;

    public AddCustomerCreditRequest() {
    }

    public AddCustomerCreditRequest(String customerId, Integer additionalCredit) {
        this.customerId = customerId;
        this.additionalCredit = additionalCredit;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Integer getAdditionalCredit() {
        return additionalCredit;
    }
}
