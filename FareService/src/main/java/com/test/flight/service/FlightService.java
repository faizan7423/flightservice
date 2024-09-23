package com.test.flight.service;

import java.util.List;

import com.test.flight.entity.Flight;

public interface FlightService {
	// Method to retrieve all flights
    List<Flight> getAllFlights();
    
    // Method to retrieve a flight by its ID
    Flight getFlightById(String id);
    
    // Method to add a new flight
    void addFlight(Flight flight);
    
    // Method to update an existing flight by its ID
    void updateFlight(String id, Flight flight);
    
    // Method to delete a flight by its ID
    void deleteFlight(String id);
}