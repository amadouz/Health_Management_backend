package com.sante.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sante.entites.PlaintesPatients;

@Repository
public interface PlaintesPatientsRepository extends JpaRepository<PlaintesPatients, Long> {

	@Query(value = "SELECT `id`, `cause`, `date_enregistrement`, `designation`, `duree`, `frequence`, `intensite`, `localisation`, `unite`, `consultation_id` FROM `plaintes_patients` WHERE `consultation_id`= ?1", nativeQuery = true)
	List<PlaintesPatients> plainteConsultation(Long idConsultation);
}
