package com.magician.HomeServo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magician.HomeServo.dto.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	public Customer findByEmail(String email);
}
