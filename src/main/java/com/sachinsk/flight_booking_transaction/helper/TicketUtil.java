package com.sachinsk.flight_booking_transaction.helper;

import com.sachinsk.flight_booking_transaction.exception.InsufficientBankBalanceException;

public class TicketUtil {

    public static boolean haveSufficientBalance(int bankBalance, int flightPrice) {
        if (bankBalance<flightPrice){
            throw new InsufficientBankBalanceException("Insufficient Bank Balance!..");
        } else {
            return true;
        }
    }
}
