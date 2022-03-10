package com.project.hruser.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hruser.entities.Role;
import com.project.hruser.service.RoleService;

@RestController
@RequestMapping(value = "/roles")
public class RoleResource {

	@Autowired
	private RoleService roleService;
	
	@PostMapping(value = "/saveRole")
	public ResponseEntity<Role> saveRole(@RequestBody Role role){
		return ResponseEntity.ok(roleService.save(role));
	}
	
}
