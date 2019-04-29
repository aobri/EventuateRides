package com.aobri.eventuate.rides.customerscommon;

public class GetCustomerResponse {
    private String customerId;
    private String mobileNumber;
    private String location;
    private Integer credit;

    public GetCustomerResponse() {
    }

    public GetCustomerResponse(String customerId, String mobileNumber, String location, Integer credit) {
        this.customerId = customerId;
        this.mobileNumber = mobileNumber;
        this.location = location;
        this.credit = credit;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }
}
