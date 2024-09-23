package com.test.ticketservice.servicelayer;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.test.flight.entity.Flight;
import com.test.ticketservice.model2.FlightResponse2;


public interface TicketServiceInterface {
	
	public FlightResponse2 saveTicketDetails(FlightResponse2 flightResponse2);
    public List<FlightResponse2> getticketdetails();
    public String updateTicketDetails(String Id, String flightName, String sourceanddestination, LocalDate dateOfJourney, int availableSeats, double ticketPrice, String flightClass, String randomid, String passasngername);
    public FlightResponse2 getTicketId(String Id);
    public void deleteTicketId(String Id);
}
