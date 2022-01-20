package com.ibm.service;

import com.ibm.entity.Admin;
import com.ibm.pojo.Login;

/**
 * This Service is for Administrator
 * 
 * @author:Gandlaparthi_Pravallika
 * @version:1.0
 * @since:January 2022
 * 
 */

public interface AdminService {

	void addAdmin(Admin admin);

	Admin authenticateAdmin(Login login);
}
