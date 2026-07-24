package com.cdac.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.backend.entities.User;
import com.cdac.backend.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/users")
	public java.util.List<User> getAllUsers(){
		return userRepo.findAll();
	}
}
