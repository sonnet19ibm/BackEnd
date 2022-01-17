package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.OrderItem;
import com.ibm.repo.OrderItemRepository;

@Service
public class OrderItemServiceImpl implements OrderItemService {

	@Autowired
	private OrderItemRepository repo;
	
	@Override
	public void addOrderItem(OrderItem orderitem) {
		repo.save(orderitem);
	}

	@Override
	public void deleteOrderItem(Long id) {
		repo.deleteById(id);
	}

	@Override
	public List<OrderItem> getOrderItems() {
		return repo.findAll();
	}

}
