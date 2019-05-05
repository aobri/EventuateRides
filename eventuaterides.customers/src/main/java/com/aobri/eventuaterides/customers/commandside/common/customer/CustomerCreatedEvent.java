package com.aobri.eventuaterides.customers.commandside.common.customer;

public class CustomerCreatedEvent implements CustomerEvent {

    private String name;
    private String mobileNumber;
    private String location;

    public CustomerCreatedEvent() {
    }

    public CustomerCreatedEvent(String name, String mobileNumber, String location) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getLocation() {
        return location;
    }

}
