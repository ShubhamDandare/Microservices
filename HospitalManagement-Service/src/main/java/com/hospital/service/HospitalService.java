package com.hospital.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hospital.entity.Hospital;
import com.hospital.repository.HospitalRepository;
import com.hospital.valueObject.Doctor;
import com.hospital.valueObject.Patient;
import com.hospital.valueObject.ResponseTemplateVO;

@Service
public class HospitalService {

	@Autowired
	private HospitalRepository Hrepo;

	@Autowired
	private RestTemplate template;

	public Hospital saveHospital(Hospital hospital) {
		Hospital save = Hrepo.save(hospital);
		return save;

	}

	public List<Hospital> findall() {
		List<Hospital> findAll = Hrepo.findAll();
		return findAll;

	}

	public Hospital findbyid(Long id) {
		Hospital orElseThrow = Hrepo.findById(id).orElseThrow(() -> new RuntimeException("hospital not found"));
		return orElseThrow;
	}

	public ResponseTemplateVO getHospitalwithPatient(Long id) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Hospital hospital = Hrepo.findById(id).orElseThrow(() -> new RuntimeException("hospital not found"));
		Patient patient = template.getForObject("http://PATIENTMANAGEMENT-SERVICE/patient/" + hospital.getPatientID(),
				Patient.class);
		vo.setHospital(hospital);
		vo.setPatient(patient);
		return vo;

	}

	public ResponseTemplateVO getHospitalwithDoctor(Long id) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Hospital hospital = Hrepo.findById(id).orElseThrow(() -> new RuntimeException("hospital not found"));
		Doctor doctor = template.getForObject("http://DOCTORMANAGEMENT-SERVICE/doctor/" + hospital.getDoctorID(),
				Doctor.class);
		vo.setHospital(hospital);
		vo.setDoctor(doctor);
		return vo;

	}

	public ResponseTemplateVO getHospitalwithDoctorwithPatient(Long id) {

//		String str1 = "http://localhost:8084/doctor/";
//		String str2 = "http://localhost:8082/patient/";

		ResponseTemplateVO vo = new ResponseTemplateVO();
		Hospital hospital = Hrepo.findById(id).orElseThrow(() -> new RuntimeException("hospital not found"));
		Doctor doctor = template.getForObject("http://DOCTORMANAGEMENT-SERVICE/doctor/" + hospital.getDoctorID(),
				Doctor.class);

		Patient patient = template.getForObject("http://PATIENTMANAGEMENT-SERVICE/patient/" + hospital.getPatientID(),
				Patient.class);

		vo.setHospital(hospital);
		vo.setDoctor(doctor);
		vo.setPatient(patient);
		return vo;
	}
}
