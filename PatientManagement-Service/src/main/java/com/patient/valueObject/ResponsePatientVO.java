package com.patient.valueObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor  
public class ResponsePatientVO {

	private Hospital hospital;
	private HospitalRecord record;

}
