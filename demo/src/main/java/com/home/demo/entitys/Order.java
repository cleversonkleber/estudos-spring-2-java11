package com.home.demo.entitys;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.home.demo.entitys.enums.OrderStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer statusOrder;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant moment;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "client_id")
	private User client;

	public Order() {
		super();
	}

	public Order(Long id, Instant moment,OrderStatus orderStatus,User client) {
		super();
		this.id = id;
		this.moment = moment;
		this.client = client;
		setStatusOrder(orderStatus);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public User getClient() {
		return client;
	}
	

	public OrderStatus getStatusOrder() {
		return OrderStatus.valueOf(statusOrder);
	}

	public void setStatusOrder(OrderStatus statusOrder) {
		if (statusOrder != null)
			this.statusOrder = statusOrder.getCode();
	}

	public void setClient(User client) {
		this.client = client;
	}

}
