package com.sachinsk.flight_booking_transaction.respository;

import com.sachinsk.flight_booking_transaction.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
