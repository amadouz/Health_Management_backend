package com.sante.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sante.entites.Deces;

@Repository
public interface DecesRepository extends JpaRepository<Deces, Long> {

	@Query(value = "SELECT pat.id, pat.nom, pat.prenom, pat.profession, ad.quartier, ad.secteur, de.id, de.type, de.date_deces FROM deces de, patients pat, adresses ad WHERE de.patient_id = ? and pat.adresse_id = ad.id", nativeQuery = true)
	String decesPatient(Long patientId);
	@Query(value = "SELECT * from deces where patient_Id = ?1", nativeQuery = true)
	Deces decesDuPatient(Long patientId);
	
	@Modifying
	@Query(value = "Delete from deces where patient_id = ?1", nativeQuery= true)
	void supprimerUnDeces(Long patientId);
}
