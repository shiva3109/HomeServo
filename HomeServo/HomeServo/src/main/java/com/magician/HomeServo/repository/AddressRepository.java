package com.magician.HomeServo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magician.HomeServo.dto.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
