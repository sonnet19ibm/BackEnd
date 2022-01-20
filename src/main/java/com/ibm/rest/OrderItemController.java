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

import com.ibm.entity.OrderItem;
import com.ibm.service.OrderItemService;

/**
 * This Controller is for Adding/Updating/Deleting/Getting the list of orderItem
 * 
 * @author:Poojitha_Puligundla
 * @version:1.0
 * @since:January 2022
 * 
 */

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
	
	@PutMapping(value="/updateorderitem/{id}", consumes = "application/json")
	void updateOrderItem(@RequestBody OrderItem orderitem, @PathVariable Long id)
	{
		service.updateOrderItem(orderitem, id);
		
	}
	
	@DeleteMapping(value = "/orderitem/{id}")
	public void deleteOrderItem(@PathVariable("id") Long id) {
		service.deleteOrderItem(id);
	}
	
	@GetMapping(value="/orderitemlist", produces = "application/json")
	public List<OrderItem> getOrderItems(){
		return service.getOrderItems();
	}
}
