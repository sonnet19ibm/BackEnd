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
	
	@DeleteMapping(value = "/address/{id}")
	public void deleteAddress(@PathVariable("id") Long id) {
		service.deleteAddress(id);
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
