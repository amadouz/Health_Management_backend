package com.sante.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sante.dao.PlaintesPatientsRepository;
import com.sante.entites.PlaintesPatients;
import com.sante.services.PlaintesPatientsServices;

@Service
public class PlaintesPatientsServicesImp implements PlaintesPatientsServices {

	@Autowired
	private PlaintesPatientsRepository repository;
	@Override
	public PlaintesPatients enregistrerPlaintePatient(PlaintesPatients plaintesPatient) {
		// TODO Auto-generated method stub
		return repository.save(plaintesPatient);
	}

	@Override
	public PlaintesPatients modifierPlaintePatient(PlaintesPatients plaintesPatient) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(plaintesPatient);
	}

	@Override
	public List<PlaintesPatients> listePlaintesPatient() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public PlaintesPatients unePlaintePatient(Long PlaintepatId) {
		// TODO Auto-generated method stub
		return repository.findById(PlaintepatId).orElseThrow();
	}

	@Override
	public void supprimerPlaintePatient(Long plaintePatId) {
		// TODO Auto-generated method stub
		repository.deleteById(plaintePatId);
	}

	@Override
	public List<PlaintesPatients> plainteParConsultation(Long IdConsultation) {
		// TODO Auto-generated method stub
		return repository.plainteConsultation(IdConsultation);
	}

}
