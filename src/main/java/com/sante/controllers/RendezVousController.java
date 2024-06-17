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

import com.sante.entites.RendezVous;
import com.sante.services.imp.RendezVousImp;


@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("rendezVous")
@RestController
public class RendezVousController {
	
	@Autowired
	private RendezVousImp rendezVousServices;
	
	@PostMapping("/save")
	public RendezVous save(@RequestBody RendezVous rendezVous) {
		return rendezVousServices.enregistrerRdv(rendezVous);
	}
	
	@PutMapping("/update")
	public RendezVous update(@RequestBody RendezVous rdv) {
		return rendezVousServices.modifierRdv(rdv);
	}
	
	@GetMapping("/rdvPatient/{patientId}")
	public List<RendezVous> listeRendezVousPatient(@PathVariable(name="patientId") Long patientId){
		return rendezVousServices.listeRendezVousPatient(patientId);
	}	
	
	@GetMapping("/rdvMedecin/{medecinId}")
	public List<RendezVous> listeRendezVousMedecin(@PathVariable(name="medecinId") Long medecinId){
		return rendezVousServices.listeRendezVousMedecin(medecinId);
	}
	
	@GetMapping("/rdvService/{serviceId}")
	public List<RendezVous> listeRendezVousService(@PathVariable(name="serviceId") Long serviceId){
		return rendezVousServices.listeRendezVousServiceSante(serviceId);
	}
	
	@GetMapping("/unRdv/{rdvId}")
	RendezVous unRendezVous(@PathVariable(name="rdvId") Long rendezVousId) {
		return rendezVousServices.unRendezVous(rendezVousId);
	}
	
	@DeleteMapping("/deleteRdv/{rdvId}")
	void supprimerRendezVous(@PathVariable(name="rdvId") Long rendezVousId) {
		rendezVousServices.supprimerRendezVous(rendezVousId);
	}

}
