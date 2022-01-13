package com.ibm.service;

import com.ibm.entity.Address;

public interface AddressService {

	void addAddress(Address address);

	void deleteAddress(Long id);

	void updateAddress(Address address);

}
