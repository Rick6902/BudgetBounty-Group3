package com.example.Budget_Bounty.Models;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reward {

    @Id
    private String rewardId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "txn_id", nullable = false)
    private Transaction transaction;

    @Column(nullable = false)
    private String rewardType;

    @Column(nullable = false)
    private float rewardValue;

    @Column(nullable = false)
    private boolean redeemed;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date rewardDate;
}
