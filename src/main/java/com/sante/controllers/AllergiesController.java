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

import com.sante.entites.Allergies;
import com.sante.services.AllergiesServices;

@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("allergies")
@RestController
public class AllergiesController {

	@Autowired
	private AllergiesServices allergiesServices;
	
	@PostMapping("/save")
	public Allergies save(@RequestBody Allergies allergie) {
		return allergiesServices.enregistrerAllergie(allergie);
	}
	
	@PutMapping("/update")
	public Allergies update(@RequestBody Allergies allergie) {
		return allergiesServices.modifierAllergie(allergie);
	}
	
	@GetMapping("/all")
	public List<Allergies> all(){
		return allergiesServices.listeAllergies();
	}
	
	@GetMapping("/allergie/{allergieId}")
	public Allergies getAllergie(@PathVariable(name="allergieId") Long allergieId) {
		return allergiesServices.uneAllergie(allergieId);
	}
	@GetMapping("/allergieParPatient/{patientId}")
	public Allergies getAllergieParPatient(@PathVariable(name="patientId") Long patientId) {
		return allergiesServices.lesAllergie(patientId);
	}
	@DeleteMapping("/delete/{allergieId}")
	public void delete(@PathVariable(name="allergieId") Long allergieId) {
		allergiesServices.supprimerAllergie(allergieId);
	}
}
