package com.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	@GetMapping("/hospitalFallback")
	public String HospitalfallbackMethod() {
		return "Hospital management service take longer time please try again later";
	}

	@GetMapping("/patientFallback")
	public String PatientfallbackMethod() {
		return "patient management service take longer time please try again later";
	}

	@GetMapping("/doctorFallback")
	public String DoctorfallbackMethod() {
		return "Doctor management service take longer time please try again later";
	}

	@GetMapping("/hospitalRecordFallback")
	public String HospitalRecordfallbackMethod() {
		return "HospitalRecord management service take longer time please try again later";
	}
}
