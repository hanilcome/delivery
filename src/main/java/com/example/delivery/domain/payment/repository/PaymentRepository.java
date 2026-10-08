package com.example.delivery.domain.payment.repository;

import com.example.delivery.domain.payment.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository
        extends JpaRepository<Payment, Long> {

}
