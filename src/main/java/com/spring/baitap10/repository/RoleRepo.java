package com.spring.baitap10.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.baitap10.model.Role;
import com.spring.baitap10.model.RoleName;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long>{
	Optional<Role> findByName(RoleName name);
}
