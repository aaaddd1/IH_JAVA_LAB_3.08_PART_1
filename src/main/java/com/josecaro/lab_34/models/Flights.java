package com.josecaro.lab_34.models;

import javax.persistence.*;

@Entity
@Table(name = "vuelos")
public class Flights {

    @Id
    private String flightNumber;
    private String aircraft;
    private long mileage;

    public Flights() {

    }

    public Flights(String flightNumber, String aircraft, long mileage) {
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.mileage = mileage;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }
}
