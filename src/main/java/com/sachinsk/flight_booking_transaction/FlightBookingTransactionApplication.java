package com.sachinsk.flight_booking_transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class FlightBookingTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightBookingTransactionApplication.class, args);
	}

}
