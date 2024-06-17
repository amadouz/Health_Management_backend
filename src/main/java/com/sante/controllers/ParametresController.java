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

import com.sante.entites.Parametres;
import com.sante.services.ParametresServices;
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("parametres")
@RestController
public class ParametresController {

	@Autowired
	private ParametresServices parametresServices;
	
	@PostMapping("/save")
	public Parametres save(@RequestBody Parametres parametre) {
		return parametresServices.enregistrerParametre(parametre);
	}
	
	@PutMapping("/update")
	public Parametres update(@RequestBody Parametres parametre) {
		return parametresServices.modifierParametre(parametre);
	}
	
	@GetMapping("/all")
	public List<Parametres> all(){
		return parametresServices.listeParametres();
	}
	
	@GetMapping("/parametre/{parametreId}")
	public Parametres getParametre(@PathVariable(name="parametreId") Long parametreId) {
		return parametresServices.unParametre(parametreId);
	}
	
	@DeleteMapping("/delete/{parametreId}")
	public void delete(@PathVariable(name="parametreId") Long parametreId) {
		parametresServices.supprimerParametre(parametreId);
	}
}
