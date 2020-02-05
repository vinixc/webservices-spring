package com.webservices.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
