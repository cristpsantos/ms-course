package com.pontescr.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pontescr.hruser.entitieis.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
