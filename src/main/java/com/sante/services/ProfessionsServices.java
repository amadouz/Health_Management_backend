package com.sante.services;

import java.util.List;

import com.sante.entites.Professions;



public interface ProfessionsServices {

	Professions enregistrerProfession(Professions profession);
	
	Professions modifierProfession(Professions profession);
	
	List<Professions> listeProfessions();
	
	Professions uneProfession(Long professionId);
	
	void supprimerProfession(Long professionId);
}
