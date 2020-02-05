package com.webservices.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
