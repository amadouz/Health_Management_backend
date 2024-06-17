package com.sante.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sante.entites.Adresses;
import com.sante.exception.AdresseNotFoundException;
import com.sante.services.AdressesServices;

@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("adresses")
@RestController
public class AdressesController {
	@Autowired
	private AdressesServices adressesServices;
	
	@PostMapping("/save")
	public Adresses save(@RequestBody Adresses adresse) {
		return adressesServices.enregistrerAdresse(adresse);
	}
	
	@PutMapping("/update")
	public Adresses update(@RequestBody Adresses adresse) {
		return adressesServices.modifierAdresse(adresse);
	}
	
	@GetMapping("/all")
	public List<Adresses> all() {
		return adressesServices.listeAdresses();
	}
	
	@GetMapping("/adresse/{adresseId}")
	public Adresses getAdresse(@PathVariable(name="adresseId") Long adresseId) {
		return adressesServices.uneAdresse(adresseId);
	}
	@GetMapping("/affiche/{adresseId}")
	public ResponseEntity<Object> affiche(@PathVariable(name="adresseId") Long adresseId){
		boolean find = adressesServices.foundAdresse(adresseId);
		if(find) {
			return new ResponseEntity<>(adressesServices.uneAdresse(adresseId), HttpStatus.OK);
		}else {
			throw new AdresseNotFoundException();
		}
	}
	@DeleteMapping("/delete/{adresseId}")
	public void delete(@PathVariable(name="adresseId") Long adresseId) {
		adressesServices.supprimerAdresse(adresseId);
	}
	
	@GetMapping("pays")
	public List<Object> pays(){
		return adressesServices.lesPays();
	}
}
