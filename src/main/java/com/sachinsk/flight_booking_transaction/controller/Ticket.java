package com.sachinsk.flight_booking_transaction.controller;

import com.sachinsk.flight_booking_transaction.request.TicketBooking;
import com.sachinsk.flight_booking_transaction.service.FlightBooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ticket {
    @Autowired
    private FlightBooking flightBooking;

    @PostMapping("/booking")
    public ResponseEntity<?> bookFlight(@RequestBody TicketBooking ticketBooking) {
        return new ResponseEntity<>(this.flightBooking.bookFlight(ticketBooking), HttpStatus.CREATED);
    }
}
