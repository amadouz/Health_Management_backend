package com.sante.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sante.entites.AllergiesPatient;

@Repository
public interface AllergiesPatientRepository extends JpaRepository<AllergiesPatient, Long> {

	@Query(value = "SELECT * FROM `allergies_patient` WHERE patient_id = ?", nativeQuery = true)
	List<AllergiesPatient> allergiesPatient(Long patientId);
}
