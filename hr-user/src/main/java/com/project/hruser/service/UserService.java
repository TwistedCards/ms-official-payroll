package com.project.hruser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.hruser.entities.User;
import com.project.hruser.repositories.RoleRepository;
import com.project.hruser.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;
	
	public User save(User user) {
		if(null != user.getRoles()) {
			roleRepository.saveAll(user.getRoles());
		}
		
		user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
		return userRepository.save(user);
	}
	
	public User getByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	public User getById(Long id) {
		return userRepository.findById(id).get();
	}
	
}
