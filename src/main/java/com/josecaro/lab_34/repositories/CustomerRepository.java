package com.josecaro.lab_34.repositories;

import com.josecaro.lab_34.models.Aircraft;
import com.josecaro.lab_34.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
