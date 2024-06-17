package com.sante.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sante.entites.Traitements;

@Repository
public interface TraitementsRepository extends JpaRepository<Traitements, Long> {

	@Query(value = "SELECT med.id 'medId', med.nom 'nomMed', med.prenom 'PrenomMed', med.telephone, pat.id 'patId', pat.nom 'NomPat', pat.prenom 'PrenomPat', ad.secteur, trai.id, trai.categorie, trai.nom, trai.conclusion, trai.date_entree, trai.date_sortie, trai.rendez_vous FROM traitements trai, agent_sante med, patients pat, adresses ad WHERE trai.patient_id = ?1 AND pat.adresse_id = ad.id", nativeQuery = true)
	List<String> traitementPatient(Long patientId);

}
