package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Order;
import com.ibm.repo.OrderRepository;

/**
 * This ServiceImpl is for OrderItem Service
 * 
 * @author:Poojitha_Puligundla
 * @version:1.0
 * @since:January 2022
 * 
 */

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository repo;
	
	@Autowired
	private CustomerService cservice;
	
	@Autowired
	private AddressService aservice;
	
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
	public Order updateOrder(Order order, Long id, Long aid) {
		order.setCustomer(cservice.getCustomer(id));
		order.setShippingAddress(aservice.getAddress(aid));
		return repo.save(order);
		
	}

	@Override
	public Order getOrderId(Long id) {
		return repo.getById(id);
	}

}
