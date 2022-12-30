package com.home.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.demo.entitys.Order;
import com.home.demo.repositories.OrderRepository;

@Service
public class OrderServices {
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	public Order findById(Long id) {
		Optional<Order> obj= repository.findById(id);
		return obj.get();
		
	}
}	
