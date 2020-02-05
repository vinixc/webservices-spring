package com.webservices.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
