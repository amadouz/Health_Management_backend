package com.sante.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sante.entites.ProduitsPharmacie;

@Repository
public interface ProduitsPharmacieRepository extends JpaRepository<ProduitsPharmacie, Long> {
	//utilise
	@Query(value = "select * from produits_pharmacie where pharmacie_id = ?1", nativeQuery = true)
	List<ProduitsPharmacie> produitsPharmacie(Long pharmacieId);
	
	@Query(value = "Select prod.categorie, prod.designation, prod.code, prod.date_production, prod.date_expiration, prod.quantite, prod.prix, prod.image, prod.id, prod.pharmacie_id, phar.nom, ad.secteur from produits_pharmacie prod, services_sante phar, adresses ad where designation = ?1 and quantite>0 and prod.pharmacie_id = phar.id AND phar.adresse_id = ad.id", nativeQuery = true)
	List<String> produitRare(String designation);

	//nonUtile
	@Query(value = "select * from produits_pharmacie where pharmacie_id = ?1", nativeQuery=true)
	List<ProduitsPharmacie> listeProdPharmacie(Long idPharmacie);
}
