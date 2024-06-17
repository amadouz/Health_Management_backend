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

import com.sante.entites.Professions;
import com.sante.services.ProfessionsServices;

@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("professions")
@RestController
public class ProfessionsController {

	@Autowired
	private ProfessionsServices professionsServices;
	
	@PostMapping("/save")
	public Professions save(@RequestBody Professions profession) {
		return professionsServices.enregistrerProfession(profession);
	}
	
	@PutMapping("/update")
	public Professions update(@RequestBody Professions profession) {
		return professionsServices.modifierProfession(profession);
	}
	
	@GetMapping("/all")
	public List<Professions> all(){
		return professionsServices.listeProfessions();
	}
	
	@GetMapping("/profession/{professionId}")
	public Professions getProfession(@PathVariable(name="professionId") Long professionId) {
		return professionsServices.uneProfession(professionId);
	}
		
	@DeleteMapping("/delete/{professionId}")
	public void delete(@PathVariable(name="professionId") Long professionId) {
		professionsServices.supprimerProfession(professionId);
	}
}
