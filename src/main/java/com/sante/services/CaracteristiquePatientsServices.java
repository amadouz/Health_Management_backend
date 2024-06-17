package com.sante.services;

import java.util.List;

import com.sante.entites.CaracteristiquePatients;

public interface CaracteristiquePatientsServices {

	CaracteristiquePatients enregisterCaracteristique(CaracteristiquePatients caracteristique);
	
	CaracteristiquePatients modifierCaracteristique(CaracteristiquePatients caracteristique);
	
	List<CaracteristiquePatients> listeCarateristiques();
	
	CaracteristiquePatients uneCaracteristique(Long caracteristiqueId);
	
	void supprimerCaracteristique(Long caracteristiqueId);
	
	List<CaracteristiquePatients> carateristiqueParPatient(Long patientId);
}
