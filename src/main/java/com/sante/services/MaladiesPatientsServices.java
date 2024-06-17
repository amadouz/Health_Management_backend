package com.sante.services;

import java.util.List;

import com.sante.entites.MaladiesPatients;

public interface MaladiesPatientsServices {

	MaladiesPatients enregisterMaladiesPatient(MaladiesPatients maladiePat);
	
	MaladiesPatients modifierMaladiesPatient(MaladiesPatients maladiePat);
	
	List<MaladiesPatients> listesMaladiesPatient();
	
	MaladiesPatients uneMaladiePatient(Long maladiePatId);
	
	void supprimerMaladiePatient(Long maladiePatId);	
	
	List<MaladiesPatients> maladiesParPatient(Long patientId);

	List<MaladiesPatients> maladiesParConsultation(Long consultationId);

	//List<MaladiesPatients> lesMaladiePatient(Long patientId);
}
