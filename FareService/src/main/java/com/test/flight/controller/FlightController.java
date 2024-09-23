package com.test.flight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.flight.entity.Flight;
import com.test.flight.repository.FlightRepository;
import com.test.flight.service.FlightService;

@RestController
public class FlightController {
	@Autowired
	FlightRepository flightRepository; // Repository for direct database operations
	 @Autowired
	    private FlightService flightService; // Service layer for business logic
	 @GetMapping ("/welcome")
	    public List<Flight> getAllFlights() {
	        return flightService.getAllFlights();
	    }
	// API's to retrieve all flights
	    @GetMapping("/showbyid/{id}")
	    public Flight getFlightById(@PathVariable String id) {
	        return flightService.getFlightById(id);
	    }

	    @PostMapping("/addflight")
	    public void addFlight(@RequestBody Flight flight) {
	        flightService.addFlight(flight);
	    }

	    @PutMapping("/updatebyid/{id}")
	    public void updateFlight(@PathVariable String id, @RequestBody Flight flight) {
	        flightService.updateFlight(id, flight);
	    }

	    @DeleteMapping("/deleteby/{id}")
	    public void deleteFlight(@PathVariable String id) {
	        flightService.deleteFlight(id);
	    }
	}
	


