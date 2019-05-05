package com.aobri.eventuaterides.customers.commandside.customersservice.backend;

public class AddCustomerCreditCommand implements CustomerCommand {

    private String customerId;
    private Integer additionalCredit;

    public AddCustomerCreditCommand() {
    }

    public AddCustomerCreditCommand(String customerId, Integer additionalCredit) {
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
