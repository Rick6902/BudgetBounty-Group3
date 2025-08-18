package com.example.Budget_Bounty.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Budget_Bounty.Models.Recipient;

public interface RecipientRepo extends JpaRepository<Recipient,String> {

	 
}
