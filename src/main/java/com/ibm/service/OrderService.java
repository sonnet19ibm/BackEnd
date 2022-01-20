package com.ibm.service;

import java.util.List;

import com.ibm.entity.Order;

/**
 * This Service is for Order
 * 
 * @author:Poojitha_Puligundla
 * @version:1.0
 * @since:January 2022
 * 
 */

public interface OrderService {

	void addOrder(Order order);
	
	void deleteOrder(Long id);
	
	Order getOrderId(Long id);
	
	Order updateOrder(Order order, Long id, Long aid);
	
	List<Order> getOrders();
	
}
