package com.example.Budget_Bounty.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Budget_Bounty.Models.Transaction;
@Repository
public interface TransactionRepository extends JpaRepository<Transaction,String> {

}
