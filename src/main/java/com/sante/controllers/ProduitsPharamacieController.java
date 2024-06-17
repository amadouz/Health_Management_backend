package com.sante.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sante.entites.ProduitsPharmacie;
import com.sante.services.ProduitsPharmacieServices;
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("produitspharmacie")
@RestController
public class ProduitsPharamacieController {

	@Autowired
	private ProduitsPharmacieServices produitsPharmacieServices;
	
	@PostMapping("/save")
	public ProduitsPharmacie save(@RequestBody ProduitsPharmacie produitPharmacie) {
		return produitsPharmacieServices.enregistrerProduitPharmacie(produitPharmacie);
	}
	
	@PutMapping("/update")
	public ProduitsPharmacie update(@RequestBody ProduitsPharmacie produitPharmacie) {
		return produitsPharmacieServices.modifierProduitPharmacie(produitPharmacie);
	}
	
	@GetMapping("/all")
	public List<ProduitsPharmacie> all(){
		return produitsPharmacieServices.listeProduitPharmacie();
	}
	
	@GetMapping("/produitpharmacie/{produitPharmId}")
	public ProduitsPharmacie getProduitPharmacie(@PathVariable(name="produitPharmId") Long produitPharmId) {
		return produitsPharmacieServices.unProduitPharmacie(produitPharmId);
	}
	
	@GetMapping("/produitParpharmacie/{idPharmacie}")
	public List<ProduitsPharmacie> getProdPharmacie(@PathVariable(name="idPharmacie") Long idPharmacie){
		return produitsPharmacieServices.listeProduitParPharmacie(idPharmacie);
	}
	
	@DeleteMapping("/delete/{produitPharmId}")
	public void delete(@PathVariable(name="produitPharmId") Long produitPharmId) {
		produitsPharmacieServices.supprimerProduitPharmacie(produitPharmId);
	}
	
	@GetMapping("/produitsParPharmacie/{pharmacieId}")
	public List<ProduitsPharmacie> produitsParPharmacie(@PathVariable(name = "pharmacieId") Long pharmacieId){
		return produitsPharmacieServices.produitsParPharmacie(pharmacieId);
	}
	
	@GetMapping("/rechercheProduit/{designation}")
	public List<String> rechercheProduit(@PathVariable(name = "designation") String designation){
		return produitsPharmacieServices.rechercheProduit(designation);
	}
}
