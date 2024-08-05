package com.bank.services.serviceImplentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.services.entity.Branches;
import com.bank.services.repository.BranchRepository;
import com.bank.services.service.Branch_service;


@Service
public class Branch_serviceImplementation implements Branch_service{
	
	@Autowired
	private BranchRepository  BranchRepository;
	
	
	 
	  

	  
	  public List<Branches> getAllBranchName() {
		    
		  
		  return BranchRepository.findAll();
		   
		}


}
