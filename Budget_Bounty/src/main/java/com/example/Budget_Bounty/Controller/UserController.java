package com.example.Budget_Bounty.Controller;

import java.util.List;
import java.util.concurrent.ExecutorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Budget_Bounty.Models.User;
import com.example.Budget_Bounty.Services.UserService;

@RestController
public class UserController {
	@Autowired
	UserService service;
	@GetMapping("/users")
	public List<User> getUsers(){
		return service.getAllUsers();
	}

}
