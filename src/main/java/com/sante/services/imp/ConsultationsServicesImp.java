package com.sante.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sante.dao.ConsultationsRepository;
import com.sante.entites.Consultations;
import com.sante.services.ConsultationsServices;

@Service
public class ConsultationsServicesImp implements ConsultationsServices {

	@Autowired
	private ConsultationsRepository repository;
	
	@Override
	public Consultations enregistrerConsultation(Consultations consultation) {
		// TODO Auto-generated method stub
		return repository.save(consultation);
	}

	@Override
	public Consultations modifierConsultation(Consultations consultation) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(consultation);
	}

	@Override
	public List<Consultations> listeConsultations() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Consultations uneConsultation(Long consultationId) {
		// TODO Auto-generated method stub
		return repository.findById(consultationId).orElseThrow();
	}

	@Override
	public void supprimerConsultation(Long consultationId) {
		// TODO Auto-generated method stub
		repository.deleteById(consultationId);
	}

	@Override
	public List<Consultations> listeConsultations(Long id) {
		// TODO Auto-generated method stub
		return repository.antecedantConsultations(id);
	}

	@Override
	public List<String> consultationsParMedecin(Long medecinId) {
		// TODO Auto-generated method stub
		return repository.consultationMedecin(medecinId);
	}

}
