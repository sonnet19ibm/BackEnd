package com.ibm.service;

import com.ibm.entity.Customer;
import com.ibm.entity.Order;

public interface MailService {
	void sendEmail(Order order);
	
	void sendEmailRegister(Customer customer);

}
