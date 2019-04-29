package com.aobri.eventuaterides.customers.common.driver;

public class DriverRatedEvent implements DriverEvent {

    private String driverId;
    private Integer rating;

    public DriverRatedEvent(String driverId, Integer rating) {
        this.driverId = driverId;
        this.rating = rating;
    }

    public String getDriverId() {
        return driverId;
    }

    public Integer getRating() {
        return rating;
    }
}
