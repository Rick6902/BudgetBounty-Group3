package com.example.Budget_Bounty.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Budget_Bounty.Models.UpiId;

public interface UPIRepo extends JpaRepository<UpiId,String> {

	UpiId findByUser_UserId(String userId);

	

}
