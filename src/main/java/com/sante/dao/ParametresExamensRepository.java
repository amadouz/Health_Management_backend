package com.sante.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sante.entites.ParametresExamens;

@Repository
public interface ParametresExamensRepository extends JpaRepository<ParametresExamens, Long> {

	@Query(value = "SELECT `id`, `categorie`, `designation`, `val_norm1`, `val_norm2` , `date_demande` FROM `parametres_examens` WHERE `consultation_id`= ?1", nativeQuery= true)
	List<String> DemandeExamens(Long idConsultation);

	@Query(value = "Select * from parametres_examens where consultation_id = ?1", nativeQuery = true)
	List<ParametresExamens> listeParmametre(Long idConsultation);
}
