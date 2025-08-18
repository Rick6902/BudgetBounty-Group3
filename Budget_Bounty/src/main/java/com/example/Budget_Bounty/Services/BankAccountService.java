package com.example.Budget_Bounty.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Budget_Bounty.Models.BankAccount;
import com.example.Budget_Bounty.Repositories.BankAccountRepo;

@Service
public class BankAccountService {
	@Autowired
	BankAccountRepo repo;
  public BankAccount finByuserID(String userId) {
	  BankAccount acc=repo.findByUser_UserId(userId);
	 if (acc==null) {
		 return new BankAccount();
 }
	 return acc;



	  
  }
  public BankAccount findByAccountId(String accID) {
	  return repo.findById(accID).orElse(new BankAccount());
  }
  public BankAccount findByAccountNumber(String AccountNumber) {
	  return repo.findByAccountNumberIgnoreCase(AccountNumber);
  }
  public void updateBalance(BankAccount acc) {
	  repo.save(acc);
  }
}
