package com.sante.services;

import java.util.List;

import com.sante.entites.Ordonnances;

public interface OrdonnancesServices {

	Ordonnances enregistrerOrdonnance(Ordonnances ordonnace);
	
	Ordonnances modifierOrdonnance(Ordonnances ordonnance);
	
	List<Ordonnances> listeOrdonnances();
	
	Ordonnances uneOrdonnace(Long ordonnaceId);
	
	void supprimerOrdonnance(Long ordonnanceId);
	
	List<Ordonnances> ordonnanceParConsultation(Long consultationId);
}
