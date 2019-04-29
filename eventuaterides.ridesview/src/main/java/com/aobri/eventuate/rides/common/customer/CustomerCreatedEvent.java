package com.aobri.eventuate.rides.common.customer;

public class CustomerCreatedEvent implements CustomerEvent {

    private String name;
    private String mobileNumber;
    private String location;
    private Integer credit;

    private CustomerCreatedEvent(String name, String mobileNumber, String location, Integer credit) {

        this.name = name;
        this.mobileNumber = mobileNumber;
        this.location = location;
        this.credit = credit;
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

    public Integer getCredit() {
        return credit;
    }
}
