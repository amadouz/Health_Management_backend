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

import com.sante.entites.Plaintes;
import com.sante.services.PlaintesServices;

@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("plaintes")
@RestController
public class PlaintesController {

	@Autowired
	private PlaintesServices plaintesServices;
	
	@PostMapping("/save")
	public Plaintes save(@RequestBody Plaintes plainte) {
		return plaintesServices.enregistrerPlainte(plainte);
	}
	
	@PutMapping("/update")
	public Plaintes update(@RequestBody Plaintes plainte) {
		return plaintesServices.modifierPlainte(plainte);
	}
	
	@GetMapping("/all")
	public List<Plaintes> all(){
		return plaintesServices.listePlaintes();
	}
	
	@GetMapping("/plainte/{plainteId}")
	public Plaintes getPlainte(@PathVariable(name="plainteId") Long plainteId) {
		return plaintesServices.unePlainte(plainteId);
	}
	
	
	@GetMapping("/plainteParConsultation/{consultationId}")
	public List<Plaintes> getPlainteParConsultation(@PathVariable(name="consultationId") Long consultationId) {
		return plaintesServices.lesPlainteParConsultation(consultationId);
	}
	@DeleteMapping("/delete/{plainteId}")
	public void delete(@PathVariable(name="plainteId") Long plainteId) {
		plaintesServices.supprimerPlainte(plainteId);
	}
}
