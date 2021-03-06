package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Order;
import com.ibm.service.MailService;
import com.ibm.service.OrderService;

/**
 * This Controller is for Adding/Updating/Deleting/Getting the list of orders
 * 
 * @author:Poojitha_Puligundla
 * @version:1.0
 * @since:January 2022
 * 
 */

@CrossOrigin
@RestController
public class OrderController {

	@Autowired
	private OrderService service;
	
	@Autowired
	private MailService mservice;
	
	@PostMapping(value="/order", consumes = "application/json")
	void addOrder(@RequestBody Order order)
	{
		service.addOrder(order);
		mservice.sendEmail(order);
	}
	
	@PutMapping(value="/updateorder/{id}/{aid}", consumes = "application/json")
	void updateOrder(@RequestBody Order order, @PathVariable Long id, @PathVariable Long aid)
	{
		service.updateOrder(order, id, aid);
		mservice.sendEmail(order);
	}
	
	@DeleteMapping(value = "/order/{order_id}")
	public void deleteOrder(@PathVariable("order_id") Long id) {
		service.deleteOrder(id);
	}
	
	@GetMapping(value="/list", produces = "application/json")
	public List<Order> getOrders(){
		return service.getOrders();
	}
}
