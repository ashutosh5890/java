package com.deepak.model;

import java.sql.Date;
import java.sql.Timestamp;

public class Student {
	protected String name;
	protected String email;
	protected String username;
	protected String password;
	protected String gender;
	protected Date birthday;
	protected String mobile;
	protected Timestamp joined;
	
	public Timestamp getJoined() {
		return joined;
	}
	public void setJoined(Timestamp joined) {
		this.joined = joined;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}
