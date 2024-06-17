package com.sante.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sante.entites.Ordonnances;

@Repository
public interface OrdonnancesRepository extends JpaRepository<Ordonnances, Long> {

	@Query(value = "SELECT * FROM `ordonnances` WHERE `consultation_id`= ?1", nativeQuery = true)
	List<Ordonnances> ordonnanceConsultation(Long consultationId);
}
