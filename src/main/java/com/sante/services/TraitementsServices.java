package com.sante.services;

import java.util.List;

import com.sante.entites.Traitements;

public interface TraitementsServices {

	Traitements enregisterTraitement(Traitements traitement);
	
	Traitements modifierTraitement(Traitements traitement);
	
	List<Traitements> listeTraitement();
	
	Traitements unTraitement(Long traitementId);
	
	void supprimerTraitement(Long traitementId);
	
	List<String> traitementsParPatient(Long patientId);
}
