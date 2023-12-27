package com.magician.HomeServo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.magician.HomeServo.dto.ServiceCost;

public interface ServiceCostRepository extends JpaRepository<ServiceCost, Integer> {
	
//	public List<ServiceCost> findById(int custId);
}
