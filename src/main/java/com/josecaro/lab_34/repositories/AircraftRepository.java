package com.josecaro.lab_34.repositories;

import com.josecaro.lab_34.models.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AircraftRepository extends JpaRepository<Aircraft,String> {



}
