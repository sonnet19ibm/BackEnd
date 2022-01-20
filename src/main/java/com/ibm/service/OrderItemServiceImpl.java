package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.OrderItem;
import com.ibm.repo.OrderItemRepository;

/**
 * This ServiceImpl is for OrderItem Service
 * 
 * @author:Poojitha_Puligundla
 * @version:1.0
 * @since:January 2022
 * 
 */

@Service
public class OrderItemServiceImpl implements OrderItemService {

	@Autowired
	private OrderItemRepository repo;
	
	@Autowired
	private OrderService oservice;
	
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

	@Override
	public Long updateOrderItem(OrderItem orderitem, Long id) {
		orderitem.setOrder(oservice.getOrderId(id));
		repo.save(orderitem);
		return null;
	}

}
