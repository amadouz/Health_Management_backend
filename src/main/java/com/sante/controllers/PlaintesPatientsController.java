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

import com.sante.entites.PlaintesPatients;
import com.sante.services.PlaintesPatientsServices;

@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("plaintespatients")
@RestController
public class PlaintesPatientsController {

	@Autowired
	private PlaintesPatientsServices plaintesPatientsServices;
	
	@PostMapping("/save")
	public PlaintesPatients save(@RequestBody PlaintesPatients plaintePatient) {
		return plaintesPatientsServices.enregistrerPlaintePatient(plaintePatient);
	}
	
	@PutMapping("/update")
	public PlaintesPatients update(@RequestBody PlaintesPatients plaintePatient) {
		return plaintesPatientsServices.modifierPlaintePatient(plaintePatient);
	}
	
	@GetMapping("/all")
	public List<PlaintesPatients> all(){
		return plaintesPatientsServices.listePlaintesPatient();
	}
	
	@GetMapping("/plaintepatient/{plaintepatientId}")
	public PlaintesPatients getPlaintePatient(@PathVariable(name="plaintepatientId") Long plaintepatientId) {
		return plaintesPatientsServices.unePlaintePatient(plaintepatientId);
	}
	
	@DeleteMapping("/delete/{plaintepatientId}")
	public void delete(@PathVariable(name="plaintepatientId") Long plaintepatientId) {
		plaintesPatientsServices.supprimerPlaintePatient(plaintepatientId);
	}
	
	@GetMapping("/plainteParConsultation/{consultationId}")
	public List<PlaintesPatients> plaintParConsultation(@PathVariable(name = "consultationId") Long consultationId){
		return plaintesPatientsServices.plainteParConsultation(consultationId);
	}
}
