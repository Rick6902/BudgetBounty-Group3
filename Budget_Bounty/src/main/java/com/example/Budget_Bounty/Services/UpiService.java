package com.example.Budget_Bounty.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.Budget_Bounty.Models.UpiId;

import com.example.Budget_Bounty.Repositories.UPIRepo;

@Service
public class UpiService {
	@Autowired
	UPIRepo repo;
  public UpiId finByuserID(String userId) {
	 UpiId acc=repo.findByUser_UserId(userId);
	 if (acc==null) {
		 return new UpiId();
 }
	 return acc;



	  
  }
  public UpiId findByAccountId(String accID) {
	 UpiId u= repo.findById(accID).orElse(new UpiId());
	 return u;
	   
	  
	  
  }
  

}
