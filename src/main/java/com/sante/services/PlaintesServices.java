package com.sante.services;

import java.util.List;

import com.sante.entites.Plaintes;

public interface PlaintesServices {

	Plaintes enregistrerPlainte(Plaintes plainte);
	
	Plaintes modifierPlainte(Plaintes plainte);
	
	List<Plaintes> listePlaintes();
	
	Plaintes unePlainte(Long plainteId);
	
	void supprimerPlainte(Long plainteId);

	List<Plaintes> lesPlainteParConsultation(Long consultationId);
}
