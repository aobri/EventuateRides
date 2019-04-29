package com.aobri.eventuaterides.customers.common.customer;

public class CustomerCreditAddedEvent implements CustomerEvent {

    private Integer additionalCredit;

    public CustomerCreditAddedEvent() {
    }

    public CustomerCreditAddedEvent(Integer additionalCredit) {
        this.additionalCredit = additionalCredit;
    }

    public Integer getAdditionalCredit() {
        return additionalCredit;
    }
}
