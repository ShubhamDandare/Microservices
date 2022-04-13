package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.entity.Hospital;
import com.hospital.service.HospitalService;
import com.hospital.valueObject.ResponseTemplateVO;

@RestController
@RequestMapping("/Hospital")
public class HospitalController {

	@Autowired
	private HospitalService Hservice;

	@PostMapping("/")
	public Hospital saveHospital(@RequestBody Hospital hospital1) {
		Hospital saveHospital = Hservice.saveHospital(hospital1);
		return saveHospital;

	}

	// @GetMapping("/{ID}")
	public Hospital findbyid(@PathVariable(value = "ID") Long id) {
		Hospital findbyid = Hservice.findbyid(id);
		return findbyid;

	}

	@GetMapping("/")
	public List<Hospital> findall() {
		List<Hospital> findall = Hservice.findall();
		return findall;
	}

	@GetMapping("/hospitalwithPatient/{ID}")
	public ResponseTemplateVO getHospitalwithPatient(@PathVariable(value = "ID") Long id) {
		ResponseTemplateVO hospitalwithPatient = Hservice.getHospitalwithPatient(id);
		return hospitalwithPatient;

	}

	@GetMapping("/hospitalwithDoctor/{ID}")
	public ResponseTemplateVO getHospitalwithDoctor(@PathVariable(value = "ID") Long id) {
		ResponseTemplateVO HospitalwithDoctor = Hservice.getHospitalwithDoctor(id);
		return HospitalwithDoctor;

	}

	@GetMapping("/{ID}")
	public ResponseTemplateVO getHospitalwithDoctorwithPatient(@PathVariable(value = "ID") Long id) {
		ResponseTemplateVO getHospitalwithDoctorwithPatient = Hservice.getHospitalwithDoctorwithPatient(id);
		return getHospitalwithDoctorwithPatient;

	}

}
