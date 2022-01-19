package com.ibm.service;

import java.util.List;

import com.ibm.entity.Address;

public interface AddressService {

    void addAddress(Address address);

	void deleteAddress(Long aid);

	void updateAddress(Address address);
	
	Address getAddress(Long aid);

	List <Address> getaddresses();
	
}
