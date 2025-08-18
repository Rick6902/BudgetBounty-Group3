package com.example.Budget_Bounty.DTO;



import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



public class TransactionDTO {
	  private String senderAccountId;
	    @Override
	public String toString() {
		return "TransactionDTO [senderAccountId=" + senderAccountId + ", accountNumber=" + accountNumber
				+ ", cnfaccountNumber=" + cnfaccountNumber + ", type=" + type + ", ifscCode=" + ifscCode
				+ ", beneficiaryName=" + beneficiaryName + ", amount=" + amount + ", note=" + note + "]";
	}
		private String accountNumber;
	    private String cnfaccountNumber;
	    private String type;
	   
		private String ifscCode;
	    private String beneficiaryName;
	    private String amount;
	    private String note;
		public String getSenderAccountId() {
			return senderAccountId;
		}
		public void setSenderAccountId(String senderAccountId) {
			this.senderAccountId = senderAccountId;
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
		 public String getType() {
				return type;
			}
			public void setType(String type) {
				this.type = type;
			}
		public TransactionDTO(String senderAccountId, String accountNumber, String cnfaccountNumber, String ifscCode,
				String beneficiaryName, String amount, String note,String type) {
			super();
			this.senderAccountId = senderAccountId;
			this.accountNumber = accountNumber;
			this.cnfaccountNumber = cnfaccountNumber;
			this.ifscCode = ifscCode;
			this.beneficiaryName = beneficiaryName;
			this.amount = amount;
			this.note = note;
			this.type=type;
		}
		public TransactionDTO() {
			super();
		}
		
		
  
}
