package com.aobri.eventuaterides.drivers.common.driver;

public class DriverCreatedEvent implements DriverEvent {

    private String name;
    private String mobileNumber;

    public DriverCreatedEvent(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}
