package com.sante.services;

import java.util.List;

import com.sante.entites.Adresses;

public interface AdressesServices {

	Adresses enregistrerAdresse(Adresses adresse);
	
	Adresses modifierAdresse(Adresses adresse);
	
	List<Adresses> listeAdresses();
	
	Adresses uneAdresse(Long adresseId);
	
	void supprimerAdresse(Long adresseId);	
	
	boolean foundAdresse(Long id);
	
	List<Object> lesPays();
}
