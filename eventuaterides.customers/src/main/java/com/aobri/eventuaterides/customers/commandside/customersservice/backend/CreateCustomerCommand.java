package com.aobri.eventuaterides.customers.commandside.customersservice.backend;

public class CreateCustomerCommand implements CustomerCommand {

    private String name;
    private String mobileNumber;
    private String location;
    private Integer credit;

    public CreateCustomerCommand() {
    }

    public CreateCustomerCommand(String name, String mobileNumber, String location, Integer credit) {
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
