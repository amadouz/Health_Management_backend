package com.sante.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sante.entites.Allergies;

@Repository
public interface AllergiesRepository extends JpaRepository<Allergies, Long> {

	@Query(value = "select * from allergies_patient where patient_id =?1", nativeQuery=true)
	Allergies lesAllergies(Long patientId);

}
