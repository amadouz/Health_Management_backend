package com.sante.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sante.entites.Adresses;

@Repository
public interface AdressesRepository extends JpaRepository<Adresses, Long> {
	
	@Query(value = "Select count(*) from adresses where id = ?1", nativeQuery = true)
	int nbAdresse(Long id);
	
	@Query(value = "Select id, pays, region, commune, quartier, secteur, date_Enregistrement from adresses where id = ?1", nativeQuery = true)
	Adresses unSecteur(Long id);
	
	@Query(value = "Select pays, secteur from adresses", nativeQuery = true)
	List<Object> paysRegion();
	
}


