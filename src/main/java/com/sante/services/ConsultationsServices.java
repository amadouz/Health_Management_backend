package com.sante.services;

import java.util.List;

import com.sante.entites.Consultations;

public interface ConsultationsServices {
	
	Consultations enregistrerConsultation(Consultations consultation);
	
	Consultations modifierConsultation(Consultations consultation);
	
	List<Consultations> listeConsultations();
	
	Consultations uneConsultation(Long consultationId);
	
	void supprimerConsultation(Long consultationId);
	
	List<Consultations> listeConsultations(Long id);
	
	List<String> consultationsParMedecin(Long medecinId);
}
