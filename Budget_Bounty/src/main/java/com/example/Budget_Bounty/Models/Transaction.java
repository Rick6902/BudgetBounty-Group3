package com.example.Budget_Bounty.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    @Id
    private String txnId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "recipient_id", nullable = false)
    private Recipient recipient;

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
}
