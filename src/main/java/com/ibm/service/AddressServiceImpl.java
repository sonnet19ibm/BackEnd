package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Address;
import com.ibm.repo.AddressRepository;

/**
 * This ServiceImpl is for AddressService
 * 
 * @author:Gandlaparthi_Pravallika
 * @version:1.0
 * @since:January 2022
 * 
 */

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository repo;

	@Override
	public void addAddress(Address address) {
		repo.save(address);
	}

	@Override
	public void deleteAddress(Long aid) {
		repo.deleteById(aid);
	}

	@Override
	public void updateAddress(Address address) {
		repo.save(address);
	}

	@Override
	public List<Address> getaddresses() {
		return repo.findAll();
	}

	@Override
	public Address getAddress(Long aid) {
		return repo.getById(aid);
	}

}
