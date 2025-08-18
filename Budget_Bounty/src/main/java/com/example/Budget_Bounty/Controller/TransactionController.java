package com.example.Budget_Bounty.Controller;
import java.util.UUID;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.Budget_Bounty.DTO.UpiDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Budget_Bounty.DTO.TransactionDTO;
import com.example.Budget_Bounty.Models.Recipient;
import com.example.Budget_Bounty.Models.Transaction;
import com.example.Budget_Bounty.Repositories.TransactionRepository;
import com.example.Budget_Bounty.Services.TransactionService;
@CrossOrigin
@RestController
@RequestMapping("/payment")
public class TransactionController {
	
	
	@Autowired
	private TransactionService service;
	  
	




   
	@PostMapping("/type=rtgs")
	public List<Transaction> newRTGSTransaction(@RequestBody TransactionDTO td) {
		System.out.println(td.toString());
		List<Transaction> t=service.findAll();
		String msg=service.verifyRTGS(td);
		return t;
		
		
		
//		if (msg!=null) {
//			return new ResponseEntity(t,HTTPStatus);
//			
//		}
//		return (ResponseEntity<?>) ResponseEntity.notFound();
	}

	@PostMapping("/type=upi")
	public List<Transaction> newUPITransaction(@RequestBody UpiDTO ud){
		System.out.println(ud.toString());
		List<Transaction> t=service.findAll();
		String msg=service.verifyUPI(ud);
		return t;
	}
}

