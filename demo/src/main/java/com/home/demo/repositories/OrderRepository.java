package com.home.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.home.demo.entitys.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
