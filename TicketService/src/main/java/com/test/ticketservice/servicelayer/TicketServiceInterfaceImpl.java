package com.test.ticketservice.servicelayer;


import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

import com.google.common.base.Optional;
import com.test.ticketservice.model2.FlightResponse2;
//import com.test.ticketservice.repository.TicketServiceRepo;
import com.test.ticketservice.repository2.TicketServiceRepo2;



@Service
public class TicketServiceInterfaceImpl implements TicketServiceInterface {

	@Autowired
    TicketServiceRepo2 ticketServiceRepo2;
  

    @Override
    public FlightResponse2 saveTicketDetails(FlightResponse2 flightResponse2) {
        // TODO Auto-generated method stub
        return ticketServiceRepo2.save(flightResponse2);
    }


    @Override
    public List<FlightResponse2> getticketdetails() {
        // TODO Auto-generated method stub
        return ticketServiceRepo2.findAll();
    }


    @Override
    public String updateTicketDetails(String Id, String flightName, String sourceanddestination, LocalDate dateOfJourney, int availableSeats, double ticketPrice, String flightClass, String randomid, String passasngername) {
        java.util.Optional<FlightResponse2> flg = ticketServiceRepo2.findById(Id);
        if (flg.isPresent()) {
            FlightResponse2 flgObj = flg.get();
            flgObj.setFlightName(flightName);
            flgObj.setSourceanddestination(sourceanddestination);
            flgObj.setDateOfJourney(dateOfJourney);
            flgObj.setAvailableSeats(availableSeats);
            flgObj.setTicketPrice(ticketPrice);
            flgObj.setFlightClass(flightClass);
            flgObj.setRandomid(randomid);
            flgObj.setPassasngername(passasngername);
            
            ticketServiceRepo2.save(flgObj);
            return "Updated";
        } else {
            return "Ticket does not exist";
        }
    }


    @Override
    public FlightResponse2 getticketdetails(String Id) {
        // TODO Auto-generated method stub
        return ticketServiceRepo2.findById(String id).get();
    }

    @Override
    public void deleteTicketId(String Id) {
        // TODO Auto-generated method stub
        ticketServiceRepo2.deleteById(String Id);
    }
    
}
