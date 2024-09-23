package com.test.ticketservice.model2;
import jakarta.persistence.Id;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
@Entity
@Table(name = "second_table")
public class FlightResponse2 {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String Id;
	private String flightName;
	@Column(name = "source_and_destination")
    private String sourceanddestination;
    private LocalDate dateOfJourney;
    private int availableSeats;
    private double ticketPrice;
    private String flightClass;
    private String randomid;
    @Column(name = "passasnger_name")
    private String passasngername;
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
	public String getRandomid() {
		return randomid;
	}
	public void setRandomid(String randomid) {
		this.randomid = randomid;
	}
	public String getPassasngername() {
		return passasngername;
	}
	public void setPassasngername(String passasngername) {
		this.passasngername = passasngername;
	}

	
}
