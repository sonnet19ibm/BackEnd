package com.ibm.service;

import java.util.List;

import com.ibm.entity.Order;

public interface OrderService {

	void addOrder(Order order);
	
	void deleteOrder(Long id);
	
	List<Order> getOrders();
	
}
