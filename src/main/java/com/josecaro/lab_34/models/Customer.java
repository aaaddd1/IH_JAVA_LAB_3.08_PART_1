package com.josecaro.lab_34.models;


import com.josecaro.lab_34.enums.Status;

import javax.persistence.*;

@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    @Column(columnDefinition = "ENUM('None','Silver','Gold')")
    @Enumerated(EnumType.STRING)
    private Status status;
    private long customerMileage;


    Customer() {

    }

    public Customer(Integer id, String nombre, Status status, int customerMileage) {
        this.id = id;
        this.nombre = nombre;
        this.status = status;
        this.customerMileage = customerMileage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public long getCustomerMileage() {
        return customerMileage;
    }

    public void setCustomerMileage(long customerMileage) {
        this.customerMileage = customerMileage;
    }


}
