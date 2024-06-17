package com.sante.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sante.entites.Plaintes;

@Repository
public interface PlaintesRepository extends JpaRepository<Plaintes, Long> {

	@Query(value = "Select * from plaintes_patients where consultation_id = ?1", nativeQuery=true)
	List<Plaintes> lesPlaintesParconsultation(Long consultationId);

}
