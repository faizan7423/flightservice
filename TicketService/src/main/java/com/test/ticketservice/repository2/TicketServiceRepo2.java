package com.test.ticketservice.repository2;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.ticketservice.model2.FlightResponse2;

public interface TicketServiceRepo2 extends JpaRepository<FlightResponse2,String> {

}
