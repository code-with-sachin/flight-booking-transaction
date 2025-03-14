package com.sachinsk.flight_booking_transaction.request;

import com.sachinsk.flight_booking_transaction.entity.Payment;
import com.sachinsk.flight_booking_transaction.entity.User;

public class TicketBooking {

    private User user;

    private Payment payment;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
