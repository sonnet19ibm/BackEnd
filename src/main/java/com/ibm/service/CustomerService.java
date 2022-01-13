package com.ibm.service;

import com.ibm.entity.Customer;
import com.ibm.pojo.Login;

public interface CustomerService {
    void addCustomer(Customer customer);
	
	Customer authenticateCustomer(Login login);
}
