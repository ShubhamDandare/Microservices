package com.contactmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contactmanager.entity.User;
import com.contactmanager.repository.UserRepo;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepo repo;

	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		User save = repo.save(user);
		return save;

	}

	@GetMapping("/")
	public List<User> getAllUser() {
		List<User> findAll = repo.findAll();
		return findAll;
	}

	@GetMapping("{ID}")
	public User getUser(@PathVariable(value = "ID") Long id) {
		User orElseThrow = repo.findById(id)
				.orElseThrow(() -> new RuntimeException("user not found..................."));
		return orElseThrow;
	}

	@GetMapping("/show")
	public String show() {
		return "Hii Shubham ....welcome to window";
	}
}
