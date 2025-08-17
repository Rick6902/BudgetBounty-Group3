package com.example.Budget_Bounty.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Budget_Bounty.Models.BankAccount;
@Repository
public interface BankAccountRepo extends JpaRepository<BankAccount,String>{
	  BankAccount findByUser_UserId(String userId);
	
//    @Modifying
//	@Query("update bankaccount b set b.balance=:balance where b.account_id=:acc")
//	void updateBalance(@Param("acc") String acc, @Param("balance" )float balance);
	  
}
