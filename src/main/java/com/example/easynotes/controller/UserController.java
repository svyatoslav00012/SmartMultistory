package com.example.easynotes.controller;

import com.example.easynotes.exception.ResourceNotFoundException;
import com.example.easynotes.model.User;
import com.example.easynotes.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserRepository userRepository;

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@PostMapping("/users")
	public User createUser(@Valid @RequestBody User user) {
		return userRepository.save(user);
	}

	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable(value = "id") Long userId) {
		return userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));
	}

	@PutMapping("/users/{id}")
	public User updateUser(@PathVariable(value = "id") Long userId,
						   @Valid @RequestBody User userDetails) {

		User user = userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));

		user.setEmail(userDetails.getEmail());
		user.setFirst_name(userDetails.getFirst_name());
		user.setMiddle_name(userDetails.getMiddle_name());
		user.setLast_name(userDetails.getLast_name());
		user.setFlat_id(userDetails.getFlat_id());
		user.setRole_id(userDetails.getRole_id());
		user.setNumber(userDetails.getNumber());
		user.setPassword(userDetails.getPassword());

		User updatedUser = userRepository.save(user);
		return updatedUser;
	}

	@DeleteMapping("/users/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable(value = "id") Long userId) {
		User User = userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));

		userRepository.delete(User);

		return ResponseEntity.ok().build();
	}
}
