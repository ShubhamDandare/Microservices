package com.patient.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patient.entity.Patient;
import com.patient.repository.PatientRepo;

@Service
public class PatientService {

	@Autowired
	PatientRepo repo;

	public Patient savePatient(Patient patient) {
		Patient save = repo.save(patient);
		return save;
	}

	public List<Patient> findall() {
		List<Patient> findAll = repo.findAll();
		return findAll;
	}

	public Patient findbyid(Long id) {
		Patient orElseThrow = repo.findById(id).orElseThrow(() -> new RuntimeException("patient not found"));
		return orElseThrow;

	}
}
