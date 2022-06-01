package com.josecaro.lab_34.services;

import com.josecaro.lab_34.models.Flights;
import com.josecaro.lab_34.repositories.AircraftRepository;
import com.josecaro.lab_34.repositories.FlightsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightsService {

    @Autowired
    FlightsRepository flightsRepository;

    public List<Flights> getAllFlights() {
        return flightsRepository.findAll();
    }
/*
    public List<Flights> getAllFlightsByString(String str) {
        return flightsRepository.findAllFlightsFlightsNumberContains(str);
    }*/


}
