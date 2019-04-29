package com.aobri.eventuaterides.customers.customersservice.backend;

import io.eventuate.AggregateRepository;
import io.eventuate.EntityWithIdAndVersion;
import io.eventuate.EntityWithMetadata;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CustomerServiceImpl implements CustomerService {

    private final AggregateRepository<Customer, CustomerCommand> customerRepository;

    public CustomerServiceImpl(AggregateRepository<Customer, CustomerCommand> customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public CompletableFuture<EntityWithIdAndVersion<Customer>> createCustomer(String name, String mobileNumber, String location, Integer credit) {
        return customerRepository.save(new CreateCustomerCommand(name, mobileNumber, location, credit));
    }

    @Override
    public EntityWithMetadata<Customer> findById(String customerId) {
        EntityWithMetadata<Customer> customerWithMetadata = null;
        try {
            customerWithMetadata = customerRepository.find(customerId).get();
        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
        }
        return customerWithMetadata;
    }
}
