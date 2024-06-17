package com.sante.services;

import java.util.List;

import com.sante.entites.ProduitsPharmacie;

public interface ProduitsPharmacieServices {

	ProduitsPharmacie enregistrerProduitPharmacie(ProduitsPharmacie produitPharmacie);
	
	ProduitsPharmacie modifierProduitPharmacie(ProduitsPharmacie produitPharmacie);
	
	List<ProduitsPharmacie> listeProduitPharmacie();
	
	ProduitsPharmacie unProduitPharmacie(Long produitPharmId);
	
	void supprimerProduitPharmacie(Long produitPharmId);
	
	List<ProduitsPharmacie> produitsParPharmacie(Long pharmacieId);
	
	List<String> rechercheProduit(String designation);

	List<ProduitsPharmacie> listeProduitParPharmacie(Long idPharmacie);
}
