package com.example.Budget_Bounty.Models;



import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recipient {

    @Id
    private String recipientId;

    public String getRecipientId() {
		return recipientId;
	}
	public void setRecipientId(String recipientId) {
		this.recipientId = recipientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUpiId() {
		return upiId;
	}
	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Recipient() {
		super();
	}
	public Recipient(String recipientId, String name, String upiId, String accountNumber, String ifsc,
			String bankName) {
		super();
		this.recipientId = recipientId;
		this.name = name;
		this.upiId = upiId;
		this.accountNumber = accountNumber;
		this.ifsc = ifsc;
		this.bankName = bankName;
	}
	@Column(nullable = false)
    private String name;

    private String upiId;
    private String accountNumber;
    private String ifsc;
    private String bankName;
}

