package com.ibm.service;

import java.util.List;

import com.ibm.entity.Address;

/**
 * This Service is for Address
 * 
 * @author:Gandlaparthi_Pravallika
 * @version:1.0
 * @since:January 2022
 * 
 */

public interface AddressService {

    void addAddress(Address address);

	void deleteAddress(Long aid);

	void updateAddress(Address address);
	
	Address getAddress(Long aid);

	List <Address> getaddresses();
	
}
