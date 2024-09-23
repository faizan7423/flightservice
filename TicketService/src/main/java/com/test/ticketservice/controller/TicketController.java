package com.test.ticketservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.test.flight.entity.Flight;
import com.test.flight.repository.FlightRepository;
import com.test.ticketservice.model2.FlightResponse2;
import com.test.ticketservice.repository2.TicketServiceRepo2;
import com.test.ticketservice.servicelayer.TicketServiceInterface;


@RestController
public class TicketController {
	  private final TicketServiceInterface ticketServiceInterface;

	    @Autowired
	    private TicketServiceRepo2 ticketServiceRepo2;
	    @Autowired
	    private RestTemplate restTemplate;
	    @Autowired 
	    TicketServiceInterface ticketServiceInterface;
	    @PostMapping("/saveticket")
	    public FlightResponse2 saveTicketService(@RequestBody FlightResponse2 flightResponse) {
	        return ticketServiceInterface.saveTicketDetails(flightResponse);
	        
	    }
	    @PutMapping(value="/{passenger_id}")
	    public FlightResponse2 updateTicket(@RequestBody Flightresponse flightResponse ) {
	        return ticketService.saveTicketDetails(flightResponse);
	    }
	    @GetMapping(value="/{passenger_Id}")
	    public Flightresponse getpassengerId(@PathVariable int passenger_id) {
	        return ticketService.getTicketId(passenger_id);
	        
	    }
	    @DeleteMapping(value="/{passenger_id}")
	    public void deleteTicketbyId(@PathVariable int passenger_id)
	    {
	         ticketService.deleteTicketId(passenger_id);
	                
	    }
	    @GetMapping
	    public List<Flightresponse> getAll(@RequestBody Flightresponse flightResponse) {
	        ResponsetemplateVo vo=new ResponsetemplateVo();
	        Optional<Flightresponse> flightresponse2=ticketrepository.findById(flightResponse.getPassenger_id());
	        Flight flight= restTemplate.getForObject("localhost:9001/control/flightserv/1", Flight.class);
	        vo.setFlight(flight);
	        vo.setFlightresponse(flightResponse);
	        return ticketrepository.findAll();
	        
	    }
	
}
