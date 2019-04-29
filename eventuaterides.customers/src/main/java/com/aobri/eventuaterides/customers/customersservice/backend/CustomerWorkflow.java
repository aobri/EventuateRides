package com.aobri.eventuaterides.customers.customersservice.backend;

import com.aobri.eventuaterides.customers.common.customer.CustomerCreatedEvent;
import io.eventuate.EntityWithIdAndVersion;
import io.eventuate.EventHandlerContext;
import io.eventuate.EventHandlerMethod;
import io.eventuate.EventSubscriber;

import java.util.concurrent.CompletableFuture;

@EventSubscriber(id = "customerWorkflow")
public class CustomerWorkflow {


    @EventHandlerMethod
    public CompletableFuture<EntityWithIdAndVersion<Customer>> addCustomerCredit(
            EventHandlerContext<CustomerCreatedEvent> ctx) {
        CustomerCreatedEvent event = ctx.getEvent();
        String customerId = ctx.getEntityId();
        Integer initialCredit = event.getCredit();

        return ctx.update(Customer.class, customerId, new AddCustomerCreditCommand(initialCredit));
    }
}
