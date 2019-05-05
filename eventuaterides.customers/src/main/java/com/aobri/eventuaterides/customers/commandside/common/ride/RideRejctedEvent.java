package com.aobri.eventuaterides.customers.commandside.common.ride;

public class RideRejctedEvent implements RideEvent {

    private String customerId;
    private String driverId;
    private String fromLocation;
    private String toLocation;
    private String rejectTime;

    public RideRejctedEvent(String customerId, String driverId, String fromLocation, String toLocation, String rejectTime) {
        this.customerId = customerId;
        this.driverId = driverId;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.rejectTime = rejectTime;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getDriverId() {
        return driverId;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public String getRejectTime() {
        return rejectTime;
    }
}
