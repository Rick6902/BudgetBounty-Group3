package com.example.Budget_Bounty.DTO;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



public class TransactionDTO {
	  private String senderId;
	    private String accountNumber;
	    private String cnfaccountNumber;
	    
	    private String ifscCode;
	    private String beneficiaryName;
	    private String amount;
	    private String note;
		public TransactionDTO(String senderId, String accountNumber, String cnfaccountNumber, String iFSCCode,
				String beneficiaryName, String amount, String note) {
			
			this.senderId = senderId;
			this.accountNumber = accountNumber;
			this.cnfaccountNumber = cnfaccountNumber;
			ifscCode = iFSCCode;
			this.beneficiaryName = beneficiaryName;
			this.amount = amount;
			this.note = note;
		}
		public String getSenderId() {
			return senderId;
		}
		public void setSenderId(String  senderId) {
			this.senderId = senderId;
		}
		public String getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		public String getCnfaccountNumber() {
			return cnfaccountNumber;
		}
		public void setCnfaccountNumber(String cnfaccountNumber) {
			this.cnfaccountNumber = cnfaccountNumber;
		}
		public String getIfscCode() {
		    return ifscCode;
		}

		public void setIfscCode(String ifscCode) {
		    this.ifscCode = ifscCode;
		}
		public String getBeneficiaryName() {
			return beneficiaryName;
		}
		public void setBeneficiaryName(String beneficiaryName) {
			this.beneficiaryName = beneficiaryName;
		}
		public String getAmount() {
			return amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
		}
		public String getNote() {
			return note;
		}
		public void setNote(String note) {
			this.note = note;
		}
		@Override
		public String toString() {
			return "TransactionDTO [senderId=" + senderId + ", accountNumber=" + accountNumber + ", cnfaccountNumber="
					+ cnfaccountNumber + ", IFSCCode=" + ifscCode + ", beneficiaryName=" + beneficiaryName + ", amount="
					+ amount + ", note=" + note + "]";
		}
		
  
}
