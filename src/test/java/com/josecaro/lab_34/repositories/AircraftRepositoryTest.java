package com.josecaro.lab_34.repositories;

import com.josecaro.lab_34.models.Aircraft;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

@SpringBootTest
public class AircraftRepositoryTest {


    @Autowired
    private AircraftRepository aircraftRepository;

    @Autowired
    private FlightsRepository flightsRepository;



    @BeforeEach
    void init() {
       // aircraftRepository.save(new Aircraft("Boeing 777",100));
        aircraftRepository.saveAll(List.of(new Aircraft("Boeing 777",100),new Aircraft("Boeing 776",100),new Aircraft("Boeing 778",100)));
    }

    @AfterEach
    void tearDown() {
        aircraftRepository.deleteAll();
    }

    @Test
    void findAll_validate() {
        assertEquals(3,aircraftRepository.findAll().size());
    }







}
