package com.example.delivery.domain.order.repository;

import com.example.delivery.domain.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository
        extends JpaRepository<Order, Long> {
    List<Order> findByCustomer_Id(Long customerId);

    List<Order> findByMenu_Owner_Id(Long OwnerId);


}
