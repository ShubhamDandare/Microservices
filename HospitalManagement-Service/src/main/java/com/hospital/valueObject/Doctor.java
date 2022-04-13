package com.hospital.valueObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
	private Long id;
	private String name;
	private String qulification;
	private int salary;

}
