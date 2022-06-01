package com.josecaro.lab_34.services;

import com.josecaro.lab_34.models.Customer;
import com.josecaro.lab_34.repositories.AircraftRepository;
import com.josecaro.lab_34.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;


    public List<Customer> getAllCustomer()  {
        return customerRepository.findAll();
    }


}
