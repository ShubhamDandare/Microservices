package com.employe.demo.Entity;

import java.io.Serializable;

public class EmployeLogin implements Serializable {
private String username;
private String password;
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
public EmployeLogin(String username, String password) {
	super();
	this.username = username;
	this.password = password;
}
@Override
public String toString() {
	return "EmployeLogin [username=" + username + ", password=" + password + "]";
}


}
