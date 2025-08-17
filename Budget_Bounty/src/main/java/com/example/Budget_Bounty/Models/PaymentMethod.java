package com.example.Budget_Bounty.Models;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentMethod {

    @Id
    private String methodId;

    @Column(nullable = false)
    private String methodType;

    @Column(nullable = false)
    private String details;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
