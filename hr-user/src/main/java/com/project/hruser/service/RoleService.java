package com.project.hruser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hruser.entities.Role;
import com.project.hruser.repositories.RoleRepository;

@Service
public class RoleService {

	@Autowired
	private RoleRepository roleRepository;
	
	public Role save(Role role) {
		return roleRepository.save(role);
	}
	
}
