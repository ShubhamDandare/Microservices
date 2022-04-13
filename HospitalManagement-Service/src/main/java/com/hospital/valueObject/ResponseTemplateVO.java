package com.hospital.valueObject;

import com.hospital.entity.Hospital;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

	private Hospital hospital;
	private Patient patient;
	private Doctor doctor;
	private HospitalRecord record;
}
