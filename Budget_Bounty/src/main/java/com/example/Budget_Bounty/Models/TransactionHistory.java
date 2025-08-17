package com.example.Budget_Bounty.Models;


import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String historyId;

    @ManyToOne
    @JoinColumn(name = "txn_id", nullable = false)
    private Transaction transaction;

    private String actionType;

    @Column(nullable = false)
    private Timestamp actionTimestamp;
}

