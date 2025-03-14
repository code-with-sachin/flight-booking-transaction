package com.sachinsk.flight_booking_transaction.exception;

public class InsufficientBankBalanceException extends RuntimeException{
    public InsufficientBankBalanceException(String message) {
        super(message);
    }
}
