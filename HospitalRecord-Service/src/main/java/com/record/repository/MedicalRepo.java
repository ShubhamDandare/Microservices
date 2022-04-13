package com.record.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.record.entity.MedicalRecord;
@Repository
public interface MedicalRepo extends JpaRepository<MedicalRecord, Long> {

}
