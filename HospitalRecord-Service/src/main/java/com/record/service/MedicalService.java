package com.record.service;

import java.util.List;

import javax.print.attribute.standard.Media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.record.entity.MedicalRecord;
import com.record.repository.MedicalRepo;

@Service
public class MedicalService {

	@Autowired
	MedicalRepo repo;

	public MedicalRecord saveRecord(MedicalRecord medicalRecord) {
		MedicalRecord save = repo.save(medicalRecord);
		return save;

	}

	public List<MedicalRecord> findall() {
		List<MedicalRecord> findAll = repo.findAll();
		return findAll;
	}

	public MedicalRecord findbyid(Long id) {
		MedicalRecord orElseThrow = repo.findById(id).orElseThrow(() -> new RuntimeException("record not found"));
		return orElseThrow;
	}
}
