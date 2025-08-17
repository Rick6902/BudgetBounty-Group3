package com.example.Budget_Bounty.Controller;

import java.util.HashMap;
import java.util.Map;

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
import com.example.Budget_Bounty.Models.Transaction;
import com.example.Budget_Bounty.Repositories.TransactionRepository;
import com.example.Budget_Bounty.Services.TransactionService;
@CrossOrigin
@RestController
@RequestMapping("/payment")
public class TransactionController {
	private boolean paymentDone=false;
	private boolean paymentSuccess=false;
	@Autowired
	TransactionService service;
	@PostMapping("/type=rtgs")
	public ResponseEntity<String> newRTGSTransaction(@RequestBody TransactionDTO td) {
		System.out.println(td.toString());
		 new Thread(() -> {
	            try {
	                Thread.sleep(10000); // simulate processing
	                paymentDone = true;
	                paymentSuccess = true; // randomly success/fail
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }).start();
	        return ResponseEntity.ok("Payment initiated");
		
		
	}
	
	@GetMapping("/status/{id}")
	public void getStatus(@PathVariable String id){
//		return new ResponseEntity(service.getStatus(id),HttpStatus.OK);
	}
	@GetMapping("/processing")
    public Map<String, Object> getStatus() {
        Map<String, Object> resp = new HashMap<>();
        resp.put("done", paymentDone);
        resp.put("success", paymentSuccess);
        return resp;
    }
   
}
