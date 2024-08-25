package com.vti.entity;

import java.sql.Date;

public class User {
	private int id;
	private String username;
	private String password;
	private Department department;
	public User(int id, String username, String password, Department department) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.department = department;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}

	

}
