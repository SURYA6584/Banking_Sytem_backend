package com.bank.services.serviceImplentation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.services.entity.Banks;
import com.bank.services.repository.BanksRepository;
import com.bank.services.service.Bank_service;


@Service
public class bank_serviceImplementation implements Bank_service{

	@Autowired
	private BanksRepository BanksRepository;
	
	

	
	  
	public List<String> getAllBankName() {
		    List<Banks> Banks = BanksRepository.findAll();
		    List<String> bankNames = new ArrayList<>();

		    for (Banks Bank : Banks) {
		        bankNames.add(Bank.getBank_name());
		    }

		    return bankNames;
		}





	


	
	
	
	
	
}
