package com.test.flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.flight.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, String>{

}
