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

import com.sante.entites.Ordonnances;
import com.sante.services.OrdonnancesServices;

@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("ordonnances")
@RestController
public class OrdonnancesController {

	@Autowired
	private OrdonnancesServices ordonnancesServices;
	
	@PostMapping("/save")
	public Ordonnances save(@RequestBody Ordonnances ordonnance) {
		return ordonnancesServices.enregistrerOrdonnance(ordonnance);
	}
	
	@PutMapping("/update")
	public Ordonnances update(@RequestBody Ordonnances ordonnance) {
		return ordonnancesServices.modifierOrdonnance(ordonnance);
	}
	
	@GetMapping("/all")
	public List<Ordonnances> all(){
		return ordonnancesServices.listeOrdonnances();
	}
	
	
	
	@GetMapping("/ordonnance/{ordonnanceId}")
	public Ordonnances getOrdonnance(@PathVariable(name="ordonnanceId") Long ordonnanceId) {
		return ordonnancesServices.uneOrdonnace(ordonnanceId);
	}
	
	@DeleteMapping("/delete/{ordonnanceId}")
	public void delete(@PathVariable(name="ordonnanceId") Long ordonnanceId) {
		ordonnancesServices.supprimerOrdonnance(ordonnanceId);
	}
	
	@GetMapping("/ordonnanceParConsultation/{consultationId}")
	public List<Ordonnances> ordonnanceParConsultation(@PathVariable(name = "consultationId") Long consultationId){
		return ordonnancesServices.ordonnanceParConsultation(consultationId);
	}
}
