package com.sachinsk.flight_booking_transaction.service;

import com.sachinsk.flight_booking_transaction.entity.Payment;
import com.sachinsk.flight_booking_transaction.entity.User;
import com.sachinsk.flight_booking_transaction.request.TicketBooking;
import com.sachinsk.flight_booking_transaction.respository.PaymentRepository;
import com.sachinsk.flight_booking_transaction.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class FlightBookingImpl implements FlightBooking {
    @Autowired
    private PaymentRepository paymentRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public String bookFlight(TicketBooking ticketBooking) {
        User userResponse = this.userRepository.save(ticketBooking.getUser());
        Payment paymentRequest = ticketBooking.getPayment();
        paymentRequest.setUserId(userResponse.getId());
        this.paymentRepository.save(paymentRequest);
        return "Ticket booked Successfully!";
    }
}
