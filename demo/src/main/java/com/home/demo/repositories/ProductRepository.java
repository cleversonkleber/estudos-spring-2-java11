package com.home.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.home.demo.entitys.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
