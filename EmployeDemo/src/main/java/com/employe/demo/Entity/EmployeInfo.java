package com.employe.demo.Entity;

import java.io.Serializable;

public class EmployeInfo implements Serializable {
	private int empId;
	private String name;
	private String department;
	private double salary;
	private int contact;
	private EmployeLogin login;

	public EmployeLogin getLogin() {
		return login;
	}

	public void setLogin(EmployeLogin login) {
		this.login = login;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "EmployeInfo [empId=" + empId + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ ", contact=" + contact + ", login=" + login + "]";
	}

	public EmployeInfo(int empId, String name, String department, double salary, int contact, EmployeLogin login) {
		super();
		this.empId = empId;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.contact = contact;
		this.login = login;
	}
public EmployeInfo() {
	// TODO Auto-generated constructor stub
}
}
