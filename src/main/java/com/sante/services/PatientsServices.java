package com.sante.services;

import java.util.List;

import com.sante.entites.Patients;

public interface PatientsServices {

	Patients enregistrerPatient(Patients patient);
	
	Patients modifierPatient(Patients patient);
	
	List<Patients> listePatients();
	
	Patients unPatient(Long patientId);
	
	void supprimerPatient(Long patientId);
	
	Patients infoPatient(Long idCompte);

	Patients lePatient(String username);
}
