package com.example.Budget_Bounty.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import com.example.Budget_Bounty.Models.Transaction;
import com.example.Budget_Bounty.Repositories.TransactionRepository;

@Service
public class TransactionService {
	@Autowired
	TransactionRepository repo;
	public boolean addTransaction(Transaction trans) {
		repo.save(trans);
		return true;
		
	}
	public Transaction getStatus(String id) {
		Transaction t=(Transaction) repo.findById(id).orElse(new Transaction());
		return t;
				
	}

}
