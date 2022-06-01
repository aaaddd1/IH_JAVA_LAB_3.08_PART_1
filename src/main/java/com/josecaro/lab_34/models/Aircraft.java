package com.josecaro.lab_34.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Aircraft {

    @Id
    private String aircraft;

    private int seats;

    public Aircraft() {

    }

    public Aircraft(String aircraft, int seats) {
        this.aircraft = aircraft;
        this.seats = seats;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

}
