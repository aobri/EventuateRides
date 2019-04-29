package com.aobri.eventuaterides.customers.common.ride;

public class RideStartedEvent implements RideEvent {

    private String customerId;
    private String driverId;
    private String locationFrom;
    private String locationTo;
    private String startTime;

    public RideStartedEvent(String customerId, String driverId, String locationFrom, String locationTo, String startTime) {
        this.customerId = customerId;
        this.driverId = driverId;
        this.locationFrom = locationFrom;
        this.locationTo = locationTo;
        this.startTime = startTime;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getDriverId() {
        return driverId;
    }

    public String getLocationFrom() {
        return locationFrom;
    }

    public String getLocationTo() {
        return locationTo;
    }

    public String getStartTime() {
        return startTime;
    }
}

