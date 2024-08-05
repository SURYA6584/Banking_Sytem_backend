package com.bank.services.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.services.entity.Banks;


@Repository
public interface BanksRepository extends JpaRepository<Banks, String> {

	
	
	
	
	
	
}
