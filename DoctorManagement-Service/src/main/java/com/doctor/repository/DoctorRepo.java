package com.doctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctor.entity.Doctors;

//import jdk.javadoc.internal.doclets.toolkit.resources.doclets;
@Repository
public interface DoctorRepo extends JpaRepository<Doctors, Long> {

}
