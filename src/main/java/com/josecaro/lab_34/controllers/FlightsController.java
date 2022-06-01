package com.josecaro.lab_34.controllers;

import com.josecaro.lab_34.models.Aircraft;
import com.josecaro.lab_34.models.Flights;
import com.josecaro.lab_34.services.AircraftService;
import com.josecaro.lab_34.services.FlightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightsController {


    @Autowired
    FlightsService flightsService;

    @GetMapping("/flights/all")
    public List<Flights> getAllFlights() {
        return flightsService.getAllFlights();
    }
}
