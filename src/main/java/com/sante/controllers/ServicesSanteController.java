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

import com.sante.entites.ServicesSante;
import com.sante.services.ServicesSanteServices;
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("servicessantes")
@RestController
public class ServicesSanteController {

	@Autowired
	private ServicesSanteServices servicesSanteServices;
	
	@PostMapping("/save")
	public ServicesSante save(@RequestBody ServicesSante serviceSante) {
		return servicesSanteServices.enregistrerServiceSante(serviceSante);
	}
	
	@PutMapping("/update")
	public ServicesSante update(ServicesSante serviceSante) {
		return servicesSanteServices.modifierServiceSante(serviceSante);
	}
	
	@GetMapping("/all")
	public List<ServicesSante> all(){
		return servicesSanteServices.ListeServiceSante();
	}
	
	@GetMapping("/servicesante/{serviceSanteId}")
	public ServicesSante getServiceSante(@PathVariable(name="serviceSanteId") Long serviceSanteId) {
		return servicesSanteServices.unServiceSante(serviceSanteId);
	}
	
	@DeleteMapping("/delete/{serviceSanteId}")
	public void delete(@PathVariable(name="serviceSanteId") Long serviceSanteId) {
		servicesSanteServices.supprimerServiceSante(serviceSanteId);
	}
}
