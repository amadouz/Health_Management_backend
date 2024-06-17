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

import com.sante.entites.Patients;
import com.sante.services.PatientsServices;
import com.sante.services.imp.PatientsServicesImp;

@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("patients")
@RestController
public class PatientsController {

	@Autowired
	private PatientsServices patientsServices;
	
	@PostMapping("/save")
	public Patients save(@RequestBody Patients patient) {
		return patientsServices.enregistrerPatient(patient);
	}
	
	@PutMapping("/update")
	public Patients update(@RequestBody Patients patient) {
		return patientsServices.modifierPatient(patient);
	}
	
	@GetMapping("/all")
	public List<Patients> all(){
		return patientsServices.listePatients();
	}
	
	@GetMapping("/lepatient/{username}")
	public Patients LePatient(@PathVariable(name="username") String username) {
		return patientsServices.lePatient(username);
	}
	
	@GetMapping("/patient/{patientId}")
	public Patients getPatient(@PathVariable(name="patientId") Long patientId) {
		return patientsServices.unPatient(patientId);
	}
	
	@DeleteMapping("/delete/{patientId}")
	public void delete(@PathVariable(name="patientId") Long patientId) {
		patientsServices.supprimerPatient(patientId);
	}
	
	@GetMapping("/patientInfo/{idCompte}")
	public Patients patientInfoParCompte(@PathVariable(name="idCompte") Long idcompte) {
		return patientsServices.infoPatient(idcompte);
	}
}
