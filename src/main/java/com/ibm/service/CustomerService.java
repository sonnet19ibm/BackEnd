package com.ibm.service;

import com.ibm.entity.Customer;
import com.ibm.pojo.Login;

/**
 * This Service is for Customer
 * 
 * @author:Gandlaparthi_Pravallika
 * @version:1.0
 * @since:January 2022
 * 
 */

public interface CustomerService {
    Long addCustomer(Customer customer);
    
    Customer getCustomer(Long id);
	
	Customer authenticateCustomer(Login login);

}
