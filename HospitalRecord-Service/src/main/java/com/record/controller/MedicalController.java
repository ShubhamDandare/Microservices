package com.record.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.record.entity.MedicalRecord;
import com.record.service.MedicalService;

@RestController
@RequestMapping("/Record")
public class MedicalController {

	@Autowired
	private MedicalService service;

	@PostMapping("/")
	public MedicalRecord save(@RequestBody MedicalRecord medicalRecord) {
		MedicalRecord saveRecord = service.saveRecord(medicalRecord);
		return saveRecord;

	}

	@GetMapping("/")
	public List<MedicalRecord> findall() {
		List<MedicalRecord> findall = service.findall();
		return findall;
	}

	@GetMapping("/{ID}")
	public MedicalRecord findbyid(@PathVariable(value = "ID") Long id) {
		MedicalRecord findbyid = service.findbyid(id);
		return findbyid;

	}

}
