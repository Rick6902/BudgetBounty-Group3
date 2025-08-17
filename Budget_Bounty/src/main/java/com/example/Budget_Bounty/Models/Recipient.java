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

    @Column(nullable = false)
    private String name;

    private String upiId;
    private String accountNumber;
    private String ifsc;
    private String bankName;
}

