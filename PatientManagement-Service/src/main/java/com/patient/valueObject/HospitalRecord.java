package com.patient.valueObject;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HospitalRecord {
	private Long id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateofAdmission = new Date(System.currentTimeMillis());
	private String problem;

}