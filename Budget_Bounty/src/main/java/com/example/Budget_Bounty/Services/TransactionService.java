package com.example.Budget_Bounty.Services;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import com.example.Budget_Bounty.DTO.TransactionDTO;
import com.example.Budget_Bounty.Models.BankAccount;
import com.example.Budget_Bounty.Models.Recipient;
import com.example.Budget_Bounty.Models.Transaction;
import com.example.Budget_Bounty.Models.User;
import com.example.Budget_Bounty.Repositories.RecipientRepo;
import com.example.Budget_Bounty.Repositories.TransactionRepository;
import com.example.Budget_Bounty.Repositories.UserRepository;
import java.util.*;
@Service
public class TransactionService {
	    @Autowired

	    TransactionRepository repo;
	    BankAccountService bankservice;
	    public String generateTransactionID(String userID,String recId) {
	    	
	    	 String randomPart = UUID.randomUUID().toString().replace("-", "").substring(0, 8);
	    	 String timePart = new java.text.SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
	    	 return "TXN" +userID+ timePart + randomPart + recId;
			
	    }
	    

//	    public TransactionService(TransactionRepository repo) {
//	        this.repo = repo;
//	    }

	    public boolean addTransaction(Transaction trans) {
//	        repo.saveAll(trans);
	        return true;
	    }
//
//	    public Transaction getStatus(String id) {
//	        return repo.findById(id).orElse(new Transaction());
//	    }

	    public List<Transaction> findAll() {
	        return repo.findAll();
	    }


		public  String verifyRTGS(TransactionDTO td) {
			String msg = null;
			
			
			
			BankAccount senderacc=bankservice.finByuserID(td.getSenderId());
			BankAccount receveracc=bankservice.findByAccountId(td.getCnfaccountNumber());
			if (senderacc.getBalance()<Float.parseFloat(td.getAmount())) {
				msg="Insuffiecient Balance";
				
				
			}
			else if(receveracc.getAccountId()==null) {
				msg="Account Not Found";
				
				
			}
			else if(!receveracc.getIfsc().equals(td.getIfscCode())) {
				msg="Invalid ISFC CODE";
				
			}
			else if(!!receveracc.getName().equals(td.getBeneficiaryName())) {
				msg="Name not Matched";
			}
			else {
				senderacc.setBalance(senderacc.getBalance()-Float.parseFloat(td.getAmount()));
				receveracc.setBalance(receveracc.getBalance()+Float.parseFloat(td.getAmount()));
				bankservice.updateBalance(senderacc);
				bankservice.updateBalance(receveracc);
				
				
			}
			Transaction trans=new Transaction();
			trans.setTxnId(generateTransactionID(senderacc.getUser().getUserId(),receveracc.getUser().getUserId()));
            trans.setUser(senderacc.getUser());
            trans.setRecipient_id(receveracc.getUser().getUserId());
			trans.setAmount(Float.parseFloat(td.getAmount()));
//			trans.setTxnType(td.getType());
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

