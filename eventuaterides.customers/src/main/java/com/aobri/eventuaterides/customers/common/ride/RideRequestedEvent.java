package com.aobri.eventuaterides.customers.common.ride;

public class RideRequestedEvent implements RideEvent {

    private String customerId;
    private String locationFrom;
    private String locationTo;
    private String requestTime;

    public RideRequestedEvent(String customer_id, String location_from, String location_to, String requestTime) {
        this.customerId = customer_id;
        this.locationFrom = location_from;
        this.locationTo = location_to;
        this.requestTime = requestTime;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getLocationFrom() {
        return locationFrom;
    }

    public String getLocationTo() {
        return locationTo;
    }

    public String getRequestTime() {
        return requestTime;
    }
}
