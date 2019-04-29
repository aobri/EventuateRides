package com.aobri.eventuaterides.drivers.common.ride;

public class RideCompletedEvent implements RideEvent {

    private String customerId;
    private String driverId;
    private String fromLocation;
    private String toLocation;
    private Integer duration;
    private String completionTime;

    public RideCompletedEvent(String customerId, String driverId, String fromLocation, String toLocation, Integer duration, String completionTime) {
        this.customerId = customerId;
        this.driverId = driverId;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.duration = duration;
        this.completionTime = completionTime;
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

    public Integer getDuration() {
        return duration;
    }

    public String getCompletionTime() {
        return completionTime;
    }
}
