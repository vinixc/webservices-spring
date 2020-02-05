package com.webservices.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
