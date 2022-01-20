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

import com.ibm.entity.Address;
import com.ibm.service.AddressService;

/**
 * This Controller is for Adding/Updating/Deleting/Getting the lists of Addresses
 * 
 * @author:Gandlaparthi_Pravallika
 * @version:1.0
 * @since:January 2022
 * 
 */

@CrossOrigin
@RestController
public class AddressController {

	@Autowired
	private AddressService service;
	
	@PostMapping(value = "/address", consumes = "application/json")
	void addAddress(@RequestBody Address address)
	{
		service.addAddress(address);
	}
	
	@DeleteMapping(value = "/address/{aid}")
	public void deleteAddress(@PathVariable("aid") Long aid) {
		service.deleteAddress(aid);
	}
	
	@PutMapping(value = "/address", consumes = "application/json")
	public void updateAddress(@RequestBody Address address) {
		service.updateAddress(address);
	}
	
	@GetMapping(value="/addresslist", produces="application/json")
	public List<Address> getaddresses(){
		return service.getaddresses();
	}
}
