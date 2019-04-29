package com.aobri.eventuaterides.customers.common.ride;

public class RideAcceptedEvent implements RideEvent {

    private String customerId;
    private String driverId;
    private String fromLocation;
    private String toLocation;
    private String acceptTime;

    public RideAcceptedEvent(String customer_id, String driver_id, String location_from, String location_to, String acceptTime) {
        this.customerId = customer_id;
        this.driverId = driver_id;
        this.fromLocation = location_from;
        this.toLocation = location_to;
        this.acceptTime = acceptTime;
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

    public String getAcceptTime() {
        return acceptTime;
    }
}
