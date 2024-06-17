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

import com.sante.entites.Consultations;
import com.sante.services.ConsultationsServices;


@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("consultations")
@RestController
public class ConsultationsController {

	@Autowired
	private ConsultationsServices consultationservice;
	
	@PostMapping("/save")
	public Consultations save(@RequestBody Consultations consultation) {
		return consultationservice.enregistrerConsultation(consultation);
	}
	
	@PutMapping("/update")
	public Consultations update(@RequestBody Consultations consultation) {
		return consultationservice.modifierConsultation(consultation);
	}
	
	@GetMapping("/all")
	public List<Consultations> all(){
		return consultationservice.listeConsultations();
	}
	
	@GetMapping("/consultation/{consultationId}")
	public Consultations getConsultation(@PathVariable(name="consultationId") Long consultationId) {
		return consultationservice.uneConsultation(consultationId);
	}
	
	@DeleteMapping("/delete")
	public void delete(@PathVariable(name="consultationId") Long consultationId) {
		consultationservice.supprimerConsultation(consultationId);
	}
	
	@GetMapping("/antecedantConsultations/{patientId}")
	public List<Consultations> antecedantConsultations(@PathVariable(name = "patientId") Long patientId){
		return consultationservice.listeConsultations(patientId);
	}
	
	@GetMapping("/consultationsParMedecin/{medecinId}")
	public List<String> consultationsParMedecin(@PathVariable(name = "medecinId") Long medecinId){
		return consultationservice.consultationsParMedecin(medecinId);
	}
}
