package com.sante.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sante.entites.ResultatExamens;

@Repository
public interface ResultatExamensRepository extends JpaRepository<ResultatExamens, Long> {
	
	@Query(value = "Select * from resultat_examens where parametre_id in (select id from parametres_examens where consultation_id = ?1)", nativeQuery=true)
	List<ResultatExamens> resExamConsultation(Long consultationId);

	@Query(value = "Select * from resultat_examens where laborantin_id = ?1", nativeQuery = true)
	List<ResultatExamens> resultatLaborantin(Long laborantinId);
}
