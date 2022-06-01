package com.josecaro.lab_34.controllers;

import com.josecaro.lab_34.models.Aircraft;
import com.josecaro.lab_34.services.AircraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AircraftController {


    @Autowired
    AircraftService aircraftService;

    @GetMapping("/aircraft/all")
    public List<Aircraft> getAllAircraft() {
        return null;
    }
}
