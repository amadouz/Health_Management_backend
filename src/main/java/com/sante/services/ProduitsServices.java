package com.sante.services;

import java.util.List;

import com.sante.entites.Produits;



public interface ProduitsServices {

	Produits enregistrerProduit(Produits produit);
	
	Produits modifierProduit(Produits produit);
	
	List<Produits> listeProduits();
	
	Produits unProduit(Long produitId);
	
	void supprimerProduit(Long produitId);
}
