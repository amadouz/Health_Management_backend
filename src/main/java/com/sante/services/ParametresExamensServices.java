package com.sante.services;

import java.util.List;

import com.sante.entites.ParametresExamens;

public interface ParametresExamensServices {

	ParametresExamens enregistrerParamExam(ParametresExamens paramExam);
	
	ParametresExamens modifierParamExam(ParametresExamens paramExam);
	
	List<ParametresExamens> listeParamExamen();
	
	ParametresExamens unParamExamen(Long paramExamId);
	
	void supprimerParamExamen(Long paramExamId);
	
	List<String> examenEnCours(Long idConsultation);

	List<ParametresExamens> parametreParIdConsultation(Long idConsultation);
}
