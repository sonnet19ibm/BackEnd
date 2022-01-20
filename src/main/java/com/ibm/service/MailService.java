package com.ibm.service;

import com.ibm.entity.Customer;
import com.ibm.entity.Order;

/**
 * This Service is for Sending Email
 * 
 * @author:Ritika_Sahu
 * @version:1.0
 * @since:January 2022
 * 
 */

public interface MailService {
	void sendEmail(Order order);
	
	void sendEmailRegister(Customer customer);

}
