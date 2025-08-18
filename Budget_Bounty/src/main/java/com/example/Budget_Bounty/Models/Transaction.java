package com.example.Budget_Bounty.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "transactions")
public class Transaction {

    @Id
    private String txnId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

//    @ManyToOne
//    @JoinColumn(name = "recipient_id", nullable = false)
    @Column(nullable = false)
    private String recipient_id;

    @Column(nullable = false)
    private float amount;

    @Column(nullable = false)
    private String txnType;

    @Column(nullable = false)
    private String txnStatus;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date txnDate;

    @Column(nullable = false)
    private String txnChannel;

    @Column(nullable = false)
    private int rewardsEarned;

    @OneToMany(mappedBy = "transaction", cascade = CascadeType.ALL)
    private List<Reward> rewards;

    @OneToMany(mappedBy = "transaction", cascade = CascadeType.ALL)
    private List<TransactionHistory> history;

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRecipient_id() {
		return recipient_id;
	}

	public void setRecipient_id(String recipient_id) {
		this.recipient_id = recipient_id;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getTxnType() {
		return txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	public String getTxnStatus() {
		return txnStatus;
	}

	public void setTxnStatus(String txnStatus) {
		this.txnStatus = txnStatus;
	}

	public Date getTxnDate() {
		return txnDate;
	}

	public void setTxnDate(Date txnDate) {
		this.txnDate = txnDate;
	}

	public String getTxnChannel() {
		return txnChannel;
	}

	public void setTxnChannel(String txnChannel) {
		this.txnChannel = txnChannel;
	}

	public int getRewardsEarned() {
		return rewardsEarned;
	}

	public void setRewardsEarned(int rewardsEarned) {
		this.rewardsEarned = rewardsEarned;
	}

	public List<Reward> getRewards() {
		return rewards;
	}

	public void setRewards(List<Reward> rewards) {
		this.rewards = rewards;
	}

	public List<TransactionHistory> getHistory() {
		return history;
	}

	public void setHistory(List<TransactionHistory> history) {
		this.history = history;
	}

	public Transaction(String txnId, User user, String recipient_id, float amount, String txnType, String txnStatus,
			Date txnDate, String txnChannel, int rewardsEarned, List<Reward> rewards,
			List<TransactionHistory> history) {
		super();
		this.txnId = txnId;
		this.user = user;
		this.recipient_id = recipient_id;
		this.amount = amount;
		this.txnType = txnType;
		this.txnStatus = txnStatus;
		this.txnDate = txnDate;
		this.txnChannel = txnChannel;
		this.rewardsEarned = rewardsEarned;
		this.rewards = rewards;
		this.history = history;
	}

	public Transaction() {
		super();
	}
    
    
}
