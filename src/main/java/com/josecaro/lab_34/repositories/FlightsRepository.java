package com.josecaro.lab_34.repositories;

import com.josecaro.lab_34.models.Aircraft;
import com.josecaro.lab_34.models.Flights;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightsRepository extends JpaRepository<Flights, String> {


    /*SELECT * FROM flights WHERE flight_number LIKE "%str%" */
    // public List<Flights> findAllFlightsByFlightsNumberContains(String str);


}
