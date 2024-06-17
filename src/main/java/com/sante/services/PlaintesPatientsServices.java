package com.sante.services;

import java.util.List;

import com.sante.entites.PlaintesPatients;

public interface PlaintesPatientsServices {

	PlaintesPatients enregistrerPlaintePatient(PlaintesPatients plaintesPatient);
	
	PlaintesPatients modifierPlaintePatient(PlaintesPatients plaintesPatient);
	
	List<PlaintesPatients> listePlaintesPatient();
	
	PlaintesPatients unePlaintePatient(Long PlaintepatId);
	
	void supprimerPlaintePatient(Long plaintePatId);
	
	List<PlaintesPatients> plainteParConsultation(Long IdConsultation);
}
