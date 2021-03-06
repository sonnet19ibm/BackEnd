package com.ibm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Admin;
import com.ibm.pojo.Login;
import com.ibm.repo.AdminRepository;

/**
 * This ServiceImpl is for AdminService
 * 
 * @author:Gandlaparthi_Pravallika
 * @version:1.0
 * @since:January 2022
 * 
 */

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository repo;

	@Override
	public void addAdmin(Admin admin) {
		repo.save(admin);
	}

	@Override
	public Admin authenticateAdmin(Login login) {
		return repo.authAdmin(login.getEmailId(), login.getPassword())
				.orElseThrow(() -> new IllegalArgumentException("Invalid user or password"));
	}

}
