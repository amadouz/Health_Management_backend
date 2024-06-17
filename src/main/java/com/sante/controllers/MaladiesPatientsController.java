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

import com.sante.entites.MaladiesPatients;
import com.sante.services.MaladiesPatientsServices;

@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("maladiespatients")
@RestController
public class MaladiesPatientsController {

	@Autowired
	private MaladiesPatientsServices maladiesPatientService;
	
	@PostMapping("/save")
	public MaladiesPatients save(@RequestBody MaladiesPatients maladiesPatient) {
		return maladiesPatientService.enregisterMaladiesPatient(maladiesPatient);
	}
	
	@PutMapping("/update")
	public MaladiesPatients update(@RequestBody MaladiesPatients maladiesPatient) {
		return maladiesPatientService.modifierMaladiesPatient(maladiesPatient);
	}
	
	@GetMapping("/all")
	public List<MaladiesPatients> all(){
		return maladiesPatientService.listesMaladiesPatient();
	}
	
	@GetMapping("/maladiepatient/{maladiePatientId}")
	public MaladiesPatients getMaladiePatient(@PathVariable(name="maladiePatientId") Long maladiePatientId) {
		return maladiesPatientService.uneMaladiePatient(maladiePatientId);
	}
	
	/*@GetMapping("/maladieParPatient/{patientId}")
	public List<MaladiesPatients> getMaladieParPatient(@PathVariable(name="patientId") Long patientId) {
		return maladiesPatientService.lesMaladiePatient(patientId);
	}*/
	@DeleteMapping("/delete/{maladiePatientId}")
	public void delete(@PathVariable(name="maladiePatientId") Long maladiePatientId) {
		maladiesPatientService.supprimerMaladiePatient(maladiePatientId);
	}
	
	
	@GetMapping("/maladieParPatient/{patientId}")
	public List<MaladiesPatients> maladieParPatient(@PathVariable( name = "patientId") Long patientId){
		return maladiesPatientService.maladiesParPatient(patientId);
	}
	
	@GetMapping("/maladieParConsulation/{consultationId}")
	public List<MaladiesPatients> maladieParConsultation(@PathVariable( name = "consultationId") Long consultationId){
		return maladiesPatientService.maladiesParConsultation(consultationId);
	}
}
