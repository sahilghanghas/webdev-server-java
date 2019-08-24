package com.example.webdevserverjava.model;

public class User {
	private Integer id;
	private String uername;
	private String password;
	private String firstName;
	private String lastName;
	
	public User() {}
	public User(int id, String username, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.uername = username;
		this.lastName = lastName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUername() {
		return uername;
	}
	public void setUername(String uername) {
		this.uername = uername;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
