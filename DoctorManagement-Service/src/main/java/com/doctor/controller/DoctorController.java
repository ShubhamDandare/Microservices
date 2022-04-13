package com.doctor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doctor.entity.Doctors;
import com.doctor.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired
	DoctorService service;

	@PostMapping("/")
	public Doctors save(@RequestBody Doctors doctors) {
		Doctors savedoctor = service.savedoctor(doctors);
		return savedoctor;
	}

	@GetMapping("/")
	public List<Doctors> findall() {
		List<Doctors> findall = service.findall();
		return findall;
	}

	@GetMapping("/{ID}")
	public Doctors findbyid(@PathVariable(value = "ID") Long id) {
		Doctors findbyid = service.findbyid(id);
		return findbyid;

	}
}
