package com.ibm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Customer;
import com.ibm.pojo.Login;
import com.ibm.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository repo;
	
	@Override
	public Long addCustomer(Customer customer) {
		repo.save(customer);
		return customer.getId();
	}

	@Override
	public Customer authenticateCustomer(Login login) {
		return repo.authCustomer(login.getEmailId(), login.getPassword()).orElseThrow(()->new IllegalArgumentException("invalid emailid or password"));
	}

	@Override
	public Customer getCustomer(Long id) {
		return repo.getById(id);
	}

}
