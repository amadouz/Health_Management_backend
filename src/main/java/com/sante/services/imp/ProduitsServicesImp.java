package com.sante.services.imp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sante.dao.ProduitsRepository;
import com.sante.entites.Produits;
import com.sante.services.ProduitsServices;



@Service
public class ProduitsServicesImp implements ProduitsServices {

	@Autowired
	private ProduitsRepository repository;
	
	@Override
	public Produits enregistrerProduit(Produits produit) {
		// TODO Auto-generated method stub
		return repository.save(produit);
	}

	@Override
	public Produits modifierProduit(Produits produit) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(produit);
	}

	@Override
	public List<Produits> listeProduits() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Produits unProduit(Long produitId) {
		// TODO Auto-generated method stub
		return repository.findById(produitId).orElseThrow();
	}

	@Override
	public void supprimerProduit(Long produitId) {
		// TODO Auto-generated method stub
		repository.deleteById(produitId);
	}

}
