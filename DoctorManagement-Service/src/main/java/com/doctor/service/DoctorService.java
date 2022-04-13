package com.doctor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctor.entity.Doctors;
import com.doctor.repository.DoctorRepo;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepo repo;

	public Doctors savedoctor(Doctors doctors) {
		Doctors save = repo.save(doctors);
		return save;
	}

	public List<Doctors> findall() {

		List<Doctors> findAll = repo.findAll();
		return findAll;
	}

	public Doctors findbyid(Long id) {
		Doctors orElseThrow = repo.findById(id).orElseThrow(() -> new RuntimeException("doctor not found"));
		return orElseThrow;
	}
}
