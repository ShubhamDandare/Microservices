package com.hospital.valueObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
	private Long id;
	private String name;
	private String Diagnosis;
	private String address;

}
