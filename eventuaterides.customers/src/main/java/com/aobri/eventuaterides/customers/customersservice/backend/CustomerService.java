package com.aobri.eventuaterides.customers.customersservice.backend;

import io.eventuate.EntityWithIdAndVersion;
import io.eventuate.EntityWithMetadata;

import java.util.concurrent.CompletableFuture;

public interface CustomerService {

    CompletableFuture<EntityWithIdAndVersion<Customer>> createCustomer(String name, String mobileNumber, String location, Integer credit);

    EntityWithMetadata<Customer> findById(String customerId);
}
