package com.home.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.home.demo.entitys.Category;



public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
