package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Order;
import com.ibm.repo.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository repo;
	
	@Autowired
	private CustomerService cservice;
	
	@Override
	public void addOrder(Order order) {
		repo.save(order);
	}

	@Override
	public void deleteOrder(Long id) {
		repo.deleteById(id);
	}

	@Override
	public List<Order> getOrders() {
		return repo.findAll();
	}

	@Override
	public Order updateOrder(Order order, Long id) {
		order.setCustomer(cservice.getCustomer(id));
		return repo.save(order);
		
	}

}
