package com.sante.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sante.dao.ParametresExamensRepository;
import com.sante.entites.ParametresExamens;
import com.sante.services.ParametresExamensServices;

@Service
public class ParametresExamensServicesImp implements ParametresExamensServices {

	@Autowired
	private ParametresExamensRepository repository;
	@Override
	public ParametresExamens enregistrerParamExam(ParametresExamens paramExam) {
		// TODO Auto-generated method stub
		return repository.save(paramExam);
	}

	@Override
	public ParametresExamens modifierParamExam(ParametresExamens paramExam) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(paramExam);
	}

	@Override
	public List<ParametresExamens> listeParamExamen() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public ParametresExamens unParamExamen(Long paramExamId) {
		// TODO Auto-generated method stub
		return repository.findById(paramExamId).orElseThrow();
	}

	@Override
	public void supprimerParamExamen(Long paramExamId) {
		// TODO Auto-generated method stub
		repository.deleteById(paramExamId);
	}

	@Override
	public List<String> examenEnCours(Long idConsultation) {
		// TODO Auto-generated method stub
		return repository.DemandeExamens(idConsultation);
	}

	@Override
	public List<ParametresExamens> parametreParIdConsultation(Long idConsultation) {
		// TODO Auto-generated method stub
		return repository.listeParmametre(idConsultation);
	}

}
