package com.employe.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employe.demo.Entity.EmployeInfo;
import com.employe.demo.dao.EmployeDao;

@Service
public class EmployeServiceimpl implements EmployeService {
	@Autowired
	private EmployeDao dao;

	@Override
	public EmployeInfo saveEmp(EmployeInfo emp) {
		EmployeInfo saveEmp = dao.saveEmp(emp);
		return saveEmp;
	}

}
