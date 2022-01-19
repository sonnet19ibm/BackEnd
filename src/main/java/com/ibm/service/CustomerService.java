package com.ibm.service;

import com.ibm.entity.Customer;
import com.ibm.pojo.Login;

public interface CustomerService {
    Long addCustomer(Customer customer);
    
    Customer getCustomer(Long id);
	
	Customer authenticateCustomer(Login login);

}
