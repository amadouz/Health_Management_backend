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

import com.sante.entites.Deces;
import com.sante.services.DecesServices;

@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("deces")
@RestController
public class DecesController {

	@Autowired
	private DecesServices decesService;
	
	@PostMapping("/save")
	public Deces save(@RequestBody Deces deces) {
		return decesService.enregistrerDeces(deces);
	}
	
	@PutMapping("/update")
	public Deces update(@RequestBody Deces deces) {
		return decesService.modifierDeces(deces);
	}
	
	@GetMapping("/all")
	public List<Deces> all(){
		return decesService.listeDeces();
	}
	
	@GetMapping("/dece/{decesId}")
	public Deces getDeces(@PathVariable(name="decesId") Long decesId) {
		return decesService.unDeces(decesId);
	}
	
	@GetMapping("/decePatient/{patientId}")
	public Deces getDecesPatient(@PathVariable(name="patientId") Long patientId) {
		return decesService.DecesPatient(patientId);
	}
	
	@DeleteMapping("/delete/{decesId}")
	public void delete(@PathVariable(name="decesId") Long decesId) {
		decesService.supprimerDeces(decesId);
	}
	
//	@DeleteMapping("/deleteDeces/{patientId}")
//	public void deletePatientDeces(@PathVariable(name="patientId") Long patientId) {
//		Deces deces = decesService.DecesPatient(patientId);
//		decesService.supprimerDeces(deces.getId());
//	}
}
