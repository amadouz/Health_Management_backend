package com.sante.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sante.entites.Utilisateurs;

@Repository
public interface UtilisateursRepository extends JpaRepository<Utilisateurs, Long> {
	
	@Query(value="UPDATE utilisateurs SET etat = 0 WHERE id = ?1",nativeQuery = true)
	int suspendreUtilisateur(Long userId);
	
	@Query(value="UPDATE utilisateurs SET etat = 1 WHERE id = ?1", nativeQuery = true)
	int activerUtilisateur(Long userId);

	@Query(value ="UPDATE utilisateurs set etat = 0 WHERE id in (SELECT compte_id FROM agent_sante WHERE service_id = ?1)", nativeQuery = true)
	int suspendreService(Long serviceId);
	
	@Query(value = "UPDATE utilisateurs set etat = 1 WHERE id in (SELECT compte_id FROM agent_sante WHERE service_id = ?1)", nativeQuery = true)
	int activerService(Long serviceId);

	@Query(value = "SELECT `id`, `etat`, `password`, `role`, `username`, `date_creation` FROM `utilisateurs` WHERE username = ?1 and password = ?2", nativeQuery=true)
	Utilisateurs findUser(String username, String password);
	
	@Query(value="Select count(username) from utilisateurs", nativeQuery = true)
	int countUser();

	@Query(value="select * from patients where compte_id in (select compte_id from utilisateurs where username = ?1)", nativeQuery = true)
	Utilisateurs findAllByUsername(String username);
}
