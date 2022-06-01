package com.josecaro.lab_34.controllers;

import com.josecaro.lab_34.models.Aircraft;
import com.josecaro.lab_34.models.Customer;
import com.josecaro.lab_34.services.AircraftService;
import com.josecaro.lab_34.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {


    @Autowired
    CustomerService customerService;

    @GetMapping("/customer/all")
    public List<Customer> getAllCustomer() {
        return customerService.getAllCustomer();
    }
}
