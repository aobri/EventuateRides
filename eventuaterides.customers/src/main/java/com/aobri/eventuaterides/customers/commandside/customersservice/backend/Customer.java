package com.aobri.eventuaterides.customers.commandside.customersservice.backend;

import com.aobri.eventuaterides.customers.commandside.common.customer.CustomerCreatedEvent;
import com.aobri.eventuaterides.customers.commandside.common.customer.CustomerCreditAddedEvent;
import io.eventuate.Event;
import io.eventuate.EventUtil;
import io.eventuate.ReflectiveMutableCommandProcessingAggregate;

import java.util.List;

public class Customer extends ReflectiveMutableCommandProcessingAggregate<Customer, CustomerCommand> {

    private String name;
    private String mobileNumber;
    private String location;
    private Integer credit;
    private Integer rating;
    private Integer ratingsCount;

    public List<Event> process(CreateCustomerCommand cmd) {
        return EventUtil.events(new CustomerCreatedEvent(cmd.getName(), cmd.getMobileNumber(), cmd.getLocation()),
                new CustomerCreditAddedEvent(cmd.getCredit()));
    }

    public List<Event> process(AddCustomerCreditCommand cmd) {
        return EventUtil.events(new CustomerCreditAddedEvent(cmd.getAdditionalCredit()));
    }

    public void apply(CustomerCreatedEvent event) {
        this.name = event.getName();
        this.mobileNumber = event.getMobileNumber();
        this.location = event.getLocation();
        this.credit = 0;
    }

    public void apply(CustomerCreditAddedEvent event) {
        this.credit += event.getAdditionalCredit();
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

    public Integer getRating() {
        return rating;
    }

    public Integer getRatingsCount() {
        return ratingsCount;
    }
}
