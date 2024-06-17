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

import com.sante.entites.Maladies;
import com.sante.services.MaladiesServices;

@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("maladies")
@RestController
public class MaladiesController {

	@Autowired
	private MaladiesServices maladiesServices;
	
	@PostMapping("/save")
	public Maladies save(@RequestBody Maladies maladie) {
		return maladiesServices.enregistrerMaladie(maladie);
	}
	
	@PutMapping("/update")
	public Maladies update(@RequestBody Maladies maladie) {
		return maladiesServices.modifierMaladie(maladie);
	}
	
	@GetMapping("/all")
	public List<Maladies> all(){
		return maladiesServices.listeMaladies();
	}
	
	@GetMapping("/maladie/{maladieId}")
	public Maladies getMaladie(@PathVariable(name="maladieId") Long maladieId) {
		return maladiesServices.uneMaladie(maladieId);
	}
	
	@DeleteMapping("/delete/{maladieId}")
	public void delete(@PathVariable(name="maladieId") Long maladieId) {
		maladiesServices.supprimerMaladie(maladieId);
	}
}
