package com.aobri.eventuaterides.rides.customersservice.web;


import com.aobri.eventuaterides.rides.customersservice.backend.command.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

}
