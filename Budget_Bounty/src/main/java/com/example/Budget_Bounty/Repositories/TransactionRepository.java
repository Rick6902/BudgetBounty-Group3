package com.example.Budget_Bounty.Repositories;

import com.example.Budget_Bounty.Models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, String> {
	
}



