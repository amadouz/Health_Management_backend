package com.sante.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sante.entites.MaladiesPatients;

@Repository
public interface MaladiesPatientsRepository extends JpaRepository<MaladiesPatients, Long> {

	@Query(value = "SELECT * FROM maladies_patients WHERE consultation_id in (select id from consultations where patient_id = ?1) order by date_debut asc", nativeQuery = true)
	List<MaladiesPatients> maladiesPatient(Long patientId);
	
	@Query(value = "SELECT * FROM maladies_patients order by date_debut asc", nativeQuery = true)
	List<MaladiesPatients> maladiesPatientAll();
	
	@Query(value = "SELECT * from maladies_patients where consultation_id = ?1", nativeQuery = true)
	List<MaladiesPatients> maladiesParConsultation(Long consultationId);
}
