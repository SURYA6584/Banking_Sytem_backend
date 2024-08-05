package com.bank.services.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.services.entity.Branches;
import com.bank.services.service.Bank_service;
import com.bank.services.service.Branch_service;
import com.bank.services.service.Services_offers_service;

@RestController
@CrossOrigin(origins ="http://localhost:5173/")
@RequestMapping("/home")
public class BankController {
	
	@Autowired
	private Bank_service  bankservice;
	
	@Autowired
	private Branch_service branch_service;
	
	
	@Autowired
	private Services_offers_service Services_offers_service;
	
	@GetMapping("/bank")
	public List<String> getAllBankName(){
		
		
		return bankservice.getAllBankName();
		
	}
	
	  
	
	  @GetMapping("/branch")
	  public List<Branches> getAllBranchName(){
		  
		  
		  return branch_service.getAllBranchName();
	  }
	
	

	
	
	@GetMapping("/service/{branch_id}")
	 public List<String> getAllServiceByBranch( @PathVariable("branch_id")  Integer branch_id) {
	 
	 
	    return Services_offers_service.getAllServiceByBranch(branch_id);
	 
	 }
	
	
	
	
}
