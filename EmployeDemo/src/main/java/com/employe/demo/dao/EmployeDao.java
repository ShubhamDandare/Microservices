package com.employe.demo.dao;

import java.util.List;

import com.employe.demo.Entity.EmployeInfo;

public interface EmployeDao {

	//EmployeInfo saveEmp(List<EmployeInfo> emp);

	EmployeInfo updateEmp(EmployeInfo emp);

	EmployeInfo saveEmp(EmployeInfo emp);

}