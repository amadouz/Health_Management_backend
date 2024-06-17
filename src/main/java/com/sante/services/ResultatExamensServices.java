package com.sante.services;

import java.util.List;

import com.sante.entites.ResultatExamens;

public interface ResultatExamensServices {

	ResultatExamens enregistrerResultatExam(ResultatExamens resultatExam);
	
	ResultatExamens modifierResultatExam(ResultatExamens resultatExam);
	
	List<ResultatExamens> listeResultatsExamen();
	
	ResultatExamens unResultatExamen(Long resultatExamId);
	
	void supprimerResultatExamen(Long resultatExamId);
	
	List<ResultatExamens> resultatParConsultation(Long consultationId);
	
	List<ResultatExamens> resultatParLaborantin(Long laborantinId);
}
