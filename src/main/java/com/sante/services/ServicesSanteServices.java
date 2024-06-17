package com.sante.services;

import java.util.List;

import com.sante.entites.ServicesSante;

public interface ServicesSanteServices {

	ServicesSante enregistrerServiceSante(ServicesSante serviceSante);
	
	ServicesSante modifierServiceSante(ServicesSante servicesSante);
	
	List<ServicesSante> ListeServiceSante();
	
	ServicesSante unServiceSante(Long serviceSanteId);
	
	void supprimerServiceSante(Long serviceSanteId);
	
}
