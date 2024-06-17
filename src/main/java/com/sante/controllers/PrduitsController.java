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

import com.sante.entites.Produits;
import com.sante.services.ProduitsServices;

@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("produits")
@RestController
public class PrduitsController {

	@Autowired
	private ProduitsServices produitsServices;
	
	@PostMapping("/save")
	public Produits save(@RequestBody Produits produit) {
		return produitsServices.enregistrerProduit(produit);
	}
	
	@PutMapping("/update")
	public Produits update(@RequestBody Produits produit) {
		return produitsServices.modifierProduit(produit);
	}
	
	@GetMapping("/all")
	public List<Produits> all(){
		return produitsServices.listeProduits();
	}
	
	@GetMapping("/produit/{produitId}")
	public Produits getProduit(@PathVariable(name="produitId") Long produitId) {
		return produitsServices.unProduit(produitId);
	}
	
	@DeleteMapping("/delete/{produitId}")
	public void delete(@PathVariable(name="produitId") Long produitId) {
		produitsServices.supprimerProduit(produitId);
	}
}
