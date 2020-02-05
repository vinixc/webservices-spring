package com.webservices.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.spring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
