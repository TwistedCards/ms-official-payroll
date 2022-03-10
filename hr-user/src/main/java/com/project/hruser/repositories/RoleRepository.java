package com.project.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.hruser.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	Role findByRoleName(String roleName);
}
