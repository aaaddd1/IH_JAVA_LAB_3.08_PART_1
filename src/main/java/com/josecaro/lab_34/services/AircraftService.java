package com.josecaro.lab_34.services;

import com.josecaro.lab_34.repositories.AircraftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AircraftService {

    @Autowired
    AircraftRepository aircraftRepository;


}
