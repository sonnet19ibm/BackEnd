package com.ibm.pojo;

public class Login {
	
    private String emailId;
	
	private String password;

	public Login(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}

	public Login() {
		super();
	}

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
