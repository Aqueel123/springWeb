package com.luv2code.springdemo.mvc.bean;

public class Employee {
	
	private String username;
	private String email;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Employee [username=" + username + ", email=" + email + "]";
	}
}
