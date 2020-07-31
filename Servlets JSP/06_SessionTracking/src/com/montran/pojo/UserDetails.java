package com.montran.pojo;

public class UserDetails {
	private String userId;
	private String password;
	private String name;

	public UserDetails(String userId, String password, String name) {
		super();
		this.userId = userId;
		this.password = password;
		this.name = name;
	}

	public UserDetails() {
		// TODO Auto-generated constructor stub
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", password=" + password + ", name=" + name + "]";
	}

}
