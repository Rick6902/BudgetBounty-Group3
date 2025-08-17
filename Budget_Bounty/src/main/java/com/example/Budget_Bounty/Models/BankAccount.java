package com.example.Budget_Bounty.Models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankAccount {

    @Id
    private String accountId;

    public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public BankAccount() {
		super();
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public BankAccount(String accountId, User user, String accountNumber, String ifsc, String bankName,
			String accountType,float balance,String name) {
		super();
		this.accountId = accountId;
		this.user = user;
		this.accountNumber = accountNumber;
		this.ifsc = ifsc;
		this.bankName = bankName;
		this.accountType = accountType;
		this.balance=balance;
		this.name=name;
		
	}

	@ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String accountNumber;

    @Column(nullable = false)
    private String ifsc;

    @Column(nullable = false)
    private String bankName;

    @Column(nullable = false)
    private String accountType;
    @Column(nullable = false)
    private float balance;
    @Column(nullable = false)
    private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
}
