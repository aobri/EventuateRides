package com.aobri.eventuaterides.drivers.common.driver;

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
