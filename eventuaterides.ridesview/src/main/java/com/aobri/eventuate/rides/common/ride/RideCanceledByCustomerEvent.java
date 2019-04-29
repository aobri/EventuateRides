package com.aobri.eventuate.rides.common.ride;

public class RideCanceledByCustomerEvent implements RideEvent {

    private String customerId;
    private String driverId;
    private String fromLocation;
    private String toLocation;
    private String cancelTime;

    public RideCanceledByCustomerEvent(String customerId, String driverId, String fromLocation, String toLocation, String cancelTime) {
        this.customerId = customerId;
        this.driverId = driverId;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.cancelTime = cancelTime;
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

    public String getCancelTime() {
        return cancelTime;
    }
}
