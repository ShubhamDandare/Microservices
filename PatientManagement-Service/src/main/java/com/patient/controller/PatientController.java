package com.patient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patient.entity.Patient;
import com.patient.repository.PatientRepo;
import com.patient.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	private PatientService service;

	@PostMapping("/")
	public Patient savePatient(@RequestBody Patient patient) {
		Patient savePatient = service.savePatient(patient);
		return savePatient;

	}

	@GetMapping("/")
	public List<Patient> findall() {
		List<Patient> findall = service.findall();
		return findall;
	}

	@GetMapping("/{ID}")
	public Patient findbyid(@PathVariable(value = "ID") Long id) {
		Patient findbyid = service.findbyid(id);
		return findbyid;

	}

}
