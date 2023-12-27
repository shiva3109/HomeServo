package com.magician.HomeServo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magician.HomeServo.dto.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

	public Vendor findByEmail(String email);

}
