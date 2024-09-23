package com.test.flight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.flight.entity.Flight;
import com.test.flight.repository.FlightRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    private FlightRepository flightRepository;
    
    // Method to retrieve all flights
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    // Method to retrieve a flight by its ID
    public Flight getFlightById(String id) {
        Optional<Flight> optionalFlight = flightRepository.findById(id);
        return optionalFlight.orElse(null);
    }

 // Method to add a new flight
    public void addFlight(Flight flight) {
        flightRepository.save(flight);
    }
 // Method to update an existing flight by its ID
    public void updateFlight(String id, Flight flight) {
        Optional<Flight> optionalFlight = flightRepository.findById(id);
        if (optionalFlight.isPresent()) {
        	Flight existingFlight = optionalFlight.get();
            existingFlight.setFlightName(flight.getFlightName());
            existingFlight.setSourceanddestination(flight.getSourceanddestination());
            existingFlight.setDateOfJourney(flight.getDateOfJourney());
            existingFlight.setAvailableSeats(flight.getAvailableSeats());
            existingFlight.setTicketPrice(flight.getTicketPrice());
            flightRepository.save(existingFlight);
        } else {
        	 throw new RuntimeException("Flight with ID " + id + " not found");
        }
    }

 // Method to delete a flight by its ID
    public void deleteFlight(String id) {
        flightRepository.deleteById(id);
    }
}