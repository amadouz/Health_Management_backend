package com.sante.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sante.entites.Consultations;

@Repository
public interface ConsultationsRepository extends JpaRepository<Consultations, Long> {
	@Query(value = "Select id from consultations", nativeQuery = true)
	List<Consultations> lesConsultations();
	
	@Query(value = "select * from consultations where patient_id = ?1", nativeQuery = true)
	List<Consultations> antecedantConsultations(Long id);
	
	@Query(value = "SELECT med.nom, med.prenom, med.telephone, pat.nom 'NomPatient', pat.prenom 'PrenomPatient', pat.telephone 'TelephonePatient', pat.profession, cons.date_consultation, cons.rendez_vous from agent_sante med, patients pat, consultations cons where cons.medecin_id = med.id and med.id= ?1", nativeQuery = true)
	List<String> consultationMedecin(Long medecinId);
}
