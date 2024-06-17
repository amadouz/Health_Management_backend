package com.sante.services;

import java.util.List;

import com.sante.entites.Allergies;

public interface AllergiesServices {
	
	Allergies enregistrerAllergie(Allergies allergie);
	
	Allergies modifierAllergie(Allergies allergie);
	
	List<Allergies> listeAllergies();
	
	Allergies uneAllergie(Long allergieId);
	
	void supprimerAllergie(Long allergieId);

	Allergies lesAllergie(Long patientId);
}
