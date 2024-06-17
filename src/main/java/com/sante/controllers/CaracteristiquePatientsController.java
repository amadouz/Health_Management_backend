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

import com.sante.entites.CaracteristiquePatients;
import com.sante.services.CaracteristiquePatientsServices;

@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("caracteristiques")
@RestController
public class CaracteristiquePatientsController {

	@Autowired
	private CaracteristiquePatientsServices caracteristiqueService;
	
	@PostMapping("/save")
	public CaracteristiquePatients save(@RequestBody CaracteristiquePatients caracteristique) {
		return caracteristiqueService.enregisterCaracteristique(caracteristique);
	}
	
	@PutMapping("/update")
	public CaracteristiquePatients update(@RequestBody CaracteristiquePatients caracteristique) {
		return caracteristiqueService.modifierCaracteristique(caracteristique);
	}
	
	@GetMapping("/all")
	public List<CaracteristiquePatients> all() {
		return caracteristiqueService.listeCarateristiques();
	}
	
	@GetMapping("/carateristique/{caracteristiqueId}")
	public CaracteristiquePatients getCaracteristique(@PathVariable(name="caracteristiqueId") Long caracteristiqueId) {
		return caracteristiqueService.uneCaracteristique(caracteristiqueId);
	}
	
	@DeleteMapping("/delete/{caracteristiqueId}")
	public void delete(@PathVariable(name="caracteristiqueId") Long caracteristiqueId) {
		caracteristiqueService.supprimerCaracteristique(caracteristiqueId);
	}
	
	@GetMapping("/caracteristiqueParPatient/{patientId}")
	public List<CaracteristiquePatients>	caracteristiqueParPatient(@PathVariable(name = "patientId") Long patientId){
		return caracteristiqueService.carateristiqueParPatient(patientId);
	}
}
