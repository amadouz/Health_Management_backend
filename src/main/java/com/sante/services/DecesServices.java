package com.sante.services;

import java.util.List;

import com.sante.entites.Deces;

public interface DecesServices {

	Deces enregistrerDeces(Deces deces);
	
	Deces modifierDeces(Deces deces);
	
	List<Deces> listeDeces();
	
	Deces unDeces(Long decesId);
	
	void supprimerDeces(Long decesId);

	Deces DecesPatient(Long patientId);

	void supprimerDecesPatient(Long patientId);
	
}
