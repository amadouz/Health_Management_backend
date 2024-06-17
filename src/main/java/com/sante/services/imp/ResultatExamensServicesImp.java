package com.sante.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sante.dao.ResultatExamensRepository;
import com.sante.entites.ResultatExamens;
import com.sante.services.ResultatExamensServices;

@Service
public class ResultatExamensServicesImp implements ResultatExamensServices {

	@Autowired
	private ResultatExamensRepository repository;
	
	@Override
	public ResultatExamens enregistrerResultatExam(ResultatExamens resultatExam) {
		// TODO Auto-generated method stub
		return repository.save(resultatExam);
	}

	@Override
	public ResultatExamens modifierResultatExam(ResultatExamens resultatExam) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(resultatExam);
	}

	@Override
	public List<ResultatExamens> listeResultatsExamen() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public ResultatExamens unResultatExamen(Long resultatExamId) {
		// TODO Auto-generated method stub
		return repository.findById(resultatExamId).orElseThrow();
	}

	@Override
	public void supprimerResultatExamen(Long resultatExamId) {
		// TODO Auto-generated method stub
		repository.deleteById(resultatExamId);
	}

	@Override
	public List<ResultatExamens> resultatParConsultation(Long consultationId) {
		// TODO Auto-generated method stub
		return repository.resExamConsultation(consultationId);
	}

	@Override
	public List<ResultatExamens> resultatParLaborantin(Long laborantinId) {
		// TODO Auto-generated method stub
		return repository.resultatLaborantin(laborantinId);
	}
}
