package com.ricardovictoriano.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ricardovictoriano.entities.User;
import com.ricardovictoriano.repositories.UserRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class UserController {

	@Autowired
	private UserRepository userRepo;

	@GetMapping("/users")
	public List<User> getUsers() {
		return userRepo.findAll();
	}

	@GetMapping("/user/{id}")
	public Optional<User> getUser(@PathVariable Long id) {
		return userRepo.findById(id);
	}

	@DeleteMapping("/user/{id}")
	public boolean deleteUser(@PathVariable Long id) {
		userRepo.deleteById(id);
		return true;
	}

	@PostMapping("/user")
	public User createUser(User user) {
		return userRepo.save(user);
	}
	
	@PutMapping("/user")
	public User updateUser(User user) {
		return userRepo.save(user);
	}

}
