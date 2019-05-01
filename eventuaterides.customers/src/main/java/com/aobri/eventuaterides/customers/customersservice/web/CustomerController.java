package com.aobri.eventuaterides.customers.customersservice.web;


import com.aobri.eventuaterides.customers.customerscommon.*;
import com.aobri.eventuaterides.customers.customersservice.backend.Customer;
import com.aobri.eventuaterides.customers.customersservice.backend.CustomerService;
import io.eventuate.EntityNotFoundException;
import io.eventuate.EntityWithMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @RequestMapping(value = "/customers", method = RequestMethod.POST)
    public CompletableFuture<CreateCustomerResponse> createCustomer(@RequestBody CreateCustomerRequest createCustomerRequest) {
        return customerService.createCustomer(createCustomerRequest.getName(), createCustomerRequest.getMobileNumber(),
                createCustomerRequest.getLocation(), createCustomerRequest.getCredit())
                .thenApply(ewidv -> new CreateCustomerResponse(ewidv.getEntityId()));
    }


    @RequestMapping(value = "/customers", method = RequestMethod.PATCH)
    public CompletableFuture<AddCustomerCreditResponse> addCredit(@RequestBody AddCustomerCreditRequest addCustomerCreditRequest) {
        return customerService.addCredit(addCustomerCreditRequest.getCustomerId(), addCustomerCreditRequest.getAdditionalCredit())
                .thenApply(customerEntityWithIdAndVersion -> new AddCustomerCreditResponse(addCustomerCreditRequest.getCustomerId(),
                        customerEntityWithIdAndVersion.getAggregate().getName(),
                        customerEntityWithIdAndVersion.getAggregate().getCredit()));
    }


    @RequestMapping(value = "/customers/{customerId}", method = RequestMethod.GET)
    public ResponseEntity<GetCustomerResponse> getCustomer(@PathVariable String customerId) {
        EntityWithMetadata<Customer> customerWithMetadata;
        Customer customer;
        try {
            customerWithMetadata = customerService.findById(customerId);
            customer = customerWithMetadata.getEntity();
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        GetCustomerResponse response =
                new GetCustomerResponse(customerWithMetadata.getEntityIdAndVersion().getEntityId(), customer.getName(),
                        customer.getMobileNumber(), customer.getLocation(), customer.getCredit());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
