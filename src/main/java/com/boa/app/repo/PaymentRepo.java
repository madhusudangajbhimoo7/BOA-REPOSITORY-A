package com.boa.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boa.app.entity.Payment;

public interface PaymentRepo extends JpaRepository<Payment, Long>{

}
