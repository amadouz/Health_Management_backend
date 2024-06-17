package com.sante.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sante.entites.CaracteristiquePatients;

@Repository
public interface CaracteristiquesPatientsRepository extends JpaRepository<CaracteristiquePatients, Long> {
	
	@Query(value = "SELECT * FROM caracteristique_patients WHERE patient_id = ?", nativeQuery = true)
	List<CaracteristiquePatients> caracteristiquePatient(Long patientId);
}
