package com.aobri.eventuaterides.customers.commandside.customersservice.backend;

import io.eventuate.EntityWithIdAndVersion;
import io.eventuate.EntityWithMetadata;

import java.util.concurrent.CompletableFuture;

public interface CustomerService {

    CompletableFuture<EntityWithIdAndVersion<Customer>> createCustomer(String name, String mobileNumber, String location, Integer credit);

    CompletableFuture<EntityWithIdAndVersion<Customer>> addCredit(String customerId, Integer additionalCredit);

    EntityWithMetadata<Customer> findById(String customerId);
}
