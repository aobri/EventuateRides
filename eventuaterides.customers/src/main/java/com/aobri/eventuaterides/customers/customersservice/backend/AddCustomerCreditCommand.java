package com.aobri.eventuaterides.customers.customersservice.backend;

public class AddCustomerCreditCommand implements CustomerCommand {

    private Integer additionalCredit;

    public AddCustomerCreditCommand( Integer additionalCredit) {
        this.additionalCredit = additionalCredit;
    }

    public Integer getAdditionalCredit() {
        return additionalCredit;
    }
}
