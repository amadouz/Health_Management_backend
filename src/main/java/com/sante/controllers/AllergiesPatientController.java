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

import com.sante.entites.AllergiesPatient;
import com.sante.services.AllergiesPatientsServices;

@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("allergiespatients")
@RestController
public class AllergiesPatientController {

	@Autowired
	private AllergiesPatientsServices allergiesPatientService;
	
	@PostMapping("/save")
	public AllergiesPatient save(@RequestBody AllergiesPatient allergiePatient) {
		return allergiesPatientService.enregistrerAllergiePatient(allergiePatient);
	}
	
	@PutMapping("/update")
	public AllergiesPatient update(@RequestBody AllergiesPatient allergiePatient) {
		return allergiesPatientService.modifierAllergiePatient(allergiePatient);
	}
	
	@GetMapping("/all")
	public List<AllergiesPatient> all(){
		return allergiesPatientService.listeAllergiesPatient();
	}
	
	@GetMapping("/allergiepatient/{allergiePatId}")
	public AllergiesPatient getAllergiePatient(@PathVariable(name="allergiePatId") Long allergiePatId) {
		return allergiesPatientService.uneAllergiePatient(allergiePatId);
	}
	
	@DeleteMapping("/delete/{allergiePatId}")
	public void delete(@PathVariable(name="allergiePatId") Long allergiePatId) {
		allergiesPatientService.supprimerAllergiePatient(allergiePatId);
	}
	
	@GetMapping("/allergiesParPatient/{patientId}")
	public List<AllergiesPatient> allergiesParPatient(@PathVariable( name = "patientId") Long patientId){
		return allergiesPatientService.allergiesParPatient(patientId);
	}
}
