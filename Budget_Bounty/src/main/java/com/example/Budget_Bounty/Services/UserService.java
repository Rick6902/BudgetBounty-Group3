package com.example.Budget_Bounty.Services;
import com.example.Budget_Bounty.Models.User;
import com.example.Budget_Bounty.Repositories.UserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserRepository repo;
	public List<User> getAllUsers(){
		return repo.findAll();
	}
	

}
