package com.sante.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sante.dao.ProduitsPharmacieRepository;
import com.sante.entites.ProduitsPharmacie;
import com.sante.services.ProduitsPharmacieServices;

@Service
public class ProduitsPharmacieServicesImp implements ProduitsPharmacieServices {

	@Autowired
	private ProduitsPharmacieRepository repository;
	
	@Override
	public ProduitsPharmacie enregistrerProduitPharmacie(ProduitsPharmacie produitPharmacie) {
		// TODO Auto-generated method stub
		return repository.save(produitPharmacie);
	}

	@Override
	public ProduitsPharmacie modifierProduitPharmacie(ProduitsPharmacie produitPharmacie) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(produitPharmacie);
	}

	@Override
	public List<ProduitsPharmacie> listeProduitPharmacie() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public ProduitsPharmacie unProduitPharmacie(Long produitPharmId) {
		// TODO Auto-generated method stub
		return repository.findById(produitPharmId).orElseThrow();
	}

	@Override
	public void supprimerProduitPharmacie(Long produitPharmId) {
		// TODO Auto-generated method stub
		repository.deleteById(produitPharmId);
	}

	@Override
	public List<ProduitsPharmacie> produitsParPharmacie(Long pharmacieId) {
		// TODO Auto-generated method stub
		return repository.produitsPharmacie(pharmacieId);
	}

	@Override
	public List<String> rechercheProduit(String designation) {
		// TODO Auto-generated method stub
		return repository.produitRare(designation);
	}

	@Override
	public List<ProduitsPharmacie> listeProduitParPharmacie(Long idPharmacie) {
		// TODO Auto-generated method stub
		return repository.listeProdPharmacie(idPharmacie);
	}

}
