package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This Entity is for Administrator Login/Registration
 * 
 * @author:Gandlaparthi_Pravallika
 * @version:1.0
 * @since:January 2022
 * 
 */

@Entity
@Table(name="admin")
public class Admin {

	@Id
	@Column(name="email",length=50)
	private String emailId;
	@Column(name="password",length=30)
	private String password;

	//Default Constructor
	public Admin() {
		super();
	}

	//Constructor using fields
	public Admin(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}

	//Getters and Setters
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
	