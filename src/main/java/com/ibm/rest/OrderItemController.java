package com.ibm.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.OrderItem;
import com.ibm.service.OrderItemService;

@CrossOrigin
@RestController
public class OrderItemController {

	@Autowired
	private OrderItemService service;
	
	@PostMapping(value="/orderitem", consumes = "application/json")
	void addOrderItem(@RequestBody OrderItem orderitem)
	{
		service.addOrderItem(orderitem);
	}
	
	@DeleteMapping(value = "/orderitem/{id}")
	public void deleteOrderItem(@PathVariable("id") Long id) {
		service.deleteOrderItem(id);
	}
}
