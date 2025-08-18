package com.example.Budget_Bounty.Services;
import java.util.List;
import java.util.UUID;

import com.example.Budget_Bounty.DTO.UpiDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import com.example.Budget_Bounty.DTO.TransactionDTO;
import com.example.Budget_Bounty.Models.BankAccount;
import com.example.Budget_Bounty.Models.Recipient;
import com.example.Budget_Bounty.Models.Transaction;
import com.example.Budget_Bounty.Models.UpiId;
import com.example.Budget_Bounty.Models.User;
import com.example.Budget_Bounty.Repositories.RecipientRepo;
import com.example.Budget_Bounty.Repositories.TransactionRepository;
import com.example.Budget_Bounty.Repositories.UserRepository;
import java.util.*;
@Service
public class TransactionService {
	
	@Autowired
    private TransactionRepository repo;

    @Autowired
    private BankAccountService bankservice;

    @Autowired
    private UpiService upiservice;
	    public String generateTransactionID(String userID,String recId) {
	    	
	    	 String randomPart = UUID.randomUUID().toString().replace("-", "").substring(0, 8);
	    	 String timePart = new java.text.SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
	    	 return "TXN" +userID+ timePart + randomPart + recId;
			
	    }

		public String generateUpiTxnId(String userID, String bankName){
			String randomPart = UUID.randomUUID().toString().replace("-","").substring(0,8);
			String timePart = new java.text.SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
			return "UPItxn"+userID+timePart+randomPart+bankName;
		}
	    

//	    public TransactionService(TransactionRepository repo) {
//	        this.repo = repo;
//	    }

	    public boolean addTransaction(Transaction trans) {
	    	repo.save(trans);
	        return true;
	    }
//
//	    public Transaction getStatus(String id) {
//	        return repo.findById(id).orElse(new Transaction());
//	    }

	    public List<Transaction> findAll() {
	        return repo.findAll();
	    }


	    public String verifyRTGS(TransactionDTO td) {
	        String msg = "none";
            System.out.println(td.getSenderAccountId());
	        BankAccount senderAcc = bankservice.findByAccountId(td.getSenderAccountId());
	        BankAccount receiverAcc = bankservice.findByAccountNumber(td.getCnfaccountNumber());
	        Transaction trans = new Transaction();
	        

	        if (senderAcc == null)  System.out.println("Sender account not found");
	        else System.out.println(senderAcc.toString());
	        if (receiverAcc == null)  System.out.println( "Receiver account not found");
	        else System.out.println(receiverAcc.toString());

	        if (senderAcc.getBalance() < Float.parseFloat(td.getAmount())) {
	            msg = "Insufficient Balance";
	        } else if (!receiverAcc.getIfsc().equals(td.getIfscCode())) {
	            msg = "Invalid IFSC CODE";
	        } else if (!receiverAcc.getName().equals(td.getBeneficiaryName())) {
	            msg = "Name not Matched";
	        } else {
	        	System.out.println("hiii");
	            senderAcc.setBalance(senderAcc.getBalance() - Float.parseFloat(td.getAmount()));
	            receiverAcc.setBalance(receiverAcc.getBalance() + Float.parseFloat(td.getAmount()));
	            bankservice.updateBalance(senderAcc);
	            bankservice.updateBalance(receiverAcc);

	           
	            trans.setTxnId(generateTransactionID(senderAcc.getUser().getUserId(), receiverAcc.getUser().getUserId()));
	            trans.setUser(senderAcc.getUser());
	            trans.setRecipient_id(receiverAcc.getUser().getUserId());
	            trans.setAmount(Float.parseFloat(td.getAmount()));
	            trans.setTxnType(td.getType());
	            trans.setTxnType("transer");
	            trans.setTxnStatus("Success");
	            trans.setTxnDate(new Date());
	            trans.setTxnChannel("RTGS");
	            trans.setRewards(null);
	            System.out.println("hiii");
	            addTransaction(trans);
	            
	            System.out.println("Transaction successful");
	        }
	        System.out.println(msg);
	        return msg;
	    }


	public  String verifyUPI(UpiDTO ud) {
		String msg = null;
       
		BankAccount senderacc=bankservice.finByuserID(ud.getSenderAccountID());
        UpiId receiverupi=upiservice.findByAccountId(ud.getCnfupiAddress());
		if (senderacc.getBalance()<Float.parseFloat(ud.getAmount())) {
			msg="Insuffiecient Balance";


		}
		else {
			senderacc.setBalance(senderacc.getBalance()-Float.parseFloat(ud.getAmount()));
			bankservice.updateBalance(senderacc);

		}
		Transaction trans=new Transaction();
		trans.setTxnId(generateUpiTxnId(senderacc.getUser().getUserId(),senderacc.getBankName()));
		trans.setUser(senderacc.getUser());
		trans.setRecipient_id(ud.getUpiAddress());
		trans.setAmount(Float.parseFloat(ud.getAmount()));
        trans.setTxnType(ud.getType());
		trans.setTxnStatus("Suscess");
		trans.setTxnDate(new Date());
		trans.setTxnChannel("NA");
		trans.setRewards(null);
		addTransaction(trans);
		

		return msg;



	}
		//TransactionDTO [senderId=21, accountNumber=42709219, 
		//cnfaccountNumber=42709219, IFSCCode=HDFC0000233, beneficiaryName=Munikarthik Vemula, amount=2000, note=]
	

	
	
//    public TransactionService(TransactionRepository repo) {
//		 System.out.println("Constructor called! repo is: " + repo);
//	       
//        this.repo = repo;
////    }
//	public boolean addTransaction(Transaction trans) {
////		repo.save(trans);
//		return true;
//		
//	}
	
	
	

}

