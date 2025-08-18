package com.example.Budget_Bounty.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Budget_Bounty.Models.User;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

	

}
