package com.sante.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sante.entites.AgentSante;

@Repository
public interface AgentSanteRepository extends JpaRepository<AgentSante, Long> {
	@Query(value = "SELECT ag.id, ag.nom, ag.prenom, ag.naissance, ag.lieu_naissance, ag.genre, ag.telephone, ag.email, ag.profession, ag.fonction, ag.photo,  ad.secteur, ser.nom 'NomService', ag.date_enregistrement FROM agent_sante ag, adresses ad, services_sante ser WHERE service_id = (SELECT id FROM services_sante WHERE type = ?1 OR nom = ?1) and ag.adresse_id = ad.id", nativeQuery= true)
	List<String> AgentProfessionService(String valeur);
	
	@Query(value = "SELECT * from agent_sante where compte_id= ?1", nativeQuery=true)
	AgentSante unAgentInfo(Long idUtilisateur);

	@Query(value = "select * from agent_sante where service_id = (select id from services_sante where id = ?1)", nativeQuery=true)
	List<AgentSante> getResponsables(Long idService);

}