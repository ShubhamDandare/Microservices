package com.employe.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employe.demo.Entity.EmployeInfo;
import com.employe.demo.Service.EmployeService;

@RestController
public class EmployeConttroller {
	@Autowired
	private EmployeService service;
	
	@PostMapping("/save")
	public EmployeInfo save(@RequestBody EmployeInfo emp) {
		return service.saveEmp(emp);
		
	}

}
