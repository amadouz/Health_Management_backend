package com.sante.services;

import java.util.List;

import com.sante.entites.AllergiesPatient;

public interface AllergiesPatientsServices {

	AllergiesPatient enregistrerAllergiePatient(AllergiesPatient allergiePatient);
	
	AllergiesPatient modifierAllergiePatient(AllergiesPatient allergiePatient);
	
	List<AllergiesPatient> listeAllergiesPatient();
	
	AllergiesPatient uneAllergiePatient(Long allergiePatientId);
	
    void supprimerAllergiePatient(Long allergiePatientId);
    
    List<AllergiesPatient> allergiesParPatient(Long patientId);
}
