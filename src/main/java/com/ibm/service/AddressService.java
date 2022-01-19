package com.ibm.service;

import java.util.List;

import com.ibm.entity.Address;

public interface AddressService {

	void addAddress(Address address);

	void deleteAddress(Long id);

	void updateAddress(Address address);

	List <Address> getaddresses();
	
}
