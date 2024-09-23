package com.test.ticketservice.model2;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "flightbookingapp")
public class Flight {
	
	@Id
    @Column(name = "flight_id")
    private String Id;
    @Column(name = "flight_name")
    private String flightName;
    @Column(name = "sourceanddestination")
    private String sourceanddestination;
    
    @Column(name = "date_of_journey")
    private LocalDate dateOfJourney;
    
    @Column(name = "available_seats")
    private int availableSeats;
    
    @Column(name = "ticket_price")
    private double ticketPrice;
    @Column(name = "flightclass")
    private String flightClass;
    
    
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getSourceanddestination() {
		return sourceanddestination;
	}
	public void setSourceanddestination(String sourceanddestination) {
		this.sourceanddestination = sourceanddestination;
	}
	public LocalDate getDateOfJourney() {
		return dateOfJourney;
	}
	public void setDateOfJourney(LocalDate dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getFlightClass() {
		return flightClass;
	}
	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}
	
	    
}