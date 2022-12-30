package com.home.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.home.demo.entitys.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
}
