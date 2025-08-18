package com.example.Budget_Bounty.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users")
public class User {

    public User() {
		super();
	}

	public User(String userId, String name, String email, String password, Date registeredAt,
			List<BankAccount> bankAccounts, List<PaymentMethod> paymentMethods, List<Transaction> transactions,
			List<Reward> rewards, List<UpiId> upiIds) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.registeredAt = registeredAt;
		this.bankAccounts = bankAccounts;
		this.paymentMethods = paymentMethods;
		this.transactions = transactions;
		this.rewards = rewards;
		this.upiIds = upiIds;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegisteredAt() {
		return registeredAt;
	}

	public void setRegisteredAt(Date registeredAt) {
		this.registeredAt = registeredAt;
	}

	public List<BankAccount> getBankAccounts() {
		return bankAccounts;
	}

	public void setBankAccounts(List<BankAccount> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}

	public List<PaymentMethod> getPaymentMethods() {
		return paymentMethods;
	}

	public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
		this.paymentMethods = paymentMethods;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public List<Reward> getRewards() {
		return rewards;
	}

	public void setRewards(List<Reward> rewards) {
		this.rewards = rewards;
	}

	public List<UpiId> getUpiIds() {
		return upiIds;
	}

	public void setUpiIds(List<UpiId> upiIds) {
		this.upiIds = upiIds;
	}

	@Id
    private String userId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date registeredAt;

    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<BankAccount> bankAccounts;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<PaymentMethod> paymentMethods;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Transaction> transactions;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Reward> rewards;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UpiId> upiIds;
}
