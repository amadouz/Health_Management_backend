package com.sante.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sante.entites.Traitements;
import com.sante.services.TraitementsServices;

@RequestMapping("traitements")
@RestController
public class TraitementsController {

	@Autowired
	private TraitementsServices traitementservice;
	
	@PostMapping("/save")
	public Traitements save(@RequestBody Traitements traitement) {
		return traitementservice.enregisterTraitement(traitement);
	}
	
	@PutMapping("/update")
	public Traitements update(@RequestBody Traitements traitement) {
		return traitementservice.modifierTraitement(traitement);
	}
	
	@GetMapping("/all")
	public List<Traitements> all(){
		return traitementservice.listeTraitement();
	}
	
	@GetMapping("/traitement/{traitementId}")
	public Traitements unTraitement(@PathVariable(name="traitementId") Long traitementId) {
		return traitementservice.unTraitement(traitementId);
	}
	
	@DeleteMapping("/delete/{traitementId}")
	public void delete(@PathVariable(name="traitementId") Long traitementId) {
		traitementservice.supprimerTraitement(traitementId);
	}
	
	@GetMapping("/traitementsParPatient/{patientId}")
	public List<String> traitementParPatient(@PathVariable(name = "patientId") Long patientId){
		return traitementservice.traitementsParPatient(patientId);
	}
}
