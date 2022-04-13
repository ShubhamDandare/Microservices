package com.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patient.entity.Patient;
@Repository
public interface PatientRepo extends JpaRepository<Patient,Long>{

}
