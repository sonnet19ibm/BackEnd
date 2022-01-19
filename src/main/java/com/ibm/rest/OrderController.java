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

@CrossOrigin
@RestController
public class OrderController {

	@Autowired
	private OrderService service;
	
	@Autowired
	private MailService mservice;
	
	@PostMapping(value="/order/{id}", consumes = "application/json")
	void addOrder(@RequestBody Order order)
	{
		service.addOrder(order);
		mservice.sendEmail(order);
	}
	
	@PutMapping(value="/updateorder/{id}", consumes = "application/json")
	void updateOrder(@RequestBody Order order, @PathVariable Long id)
	{
		service.updateOrder(order, id);
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
