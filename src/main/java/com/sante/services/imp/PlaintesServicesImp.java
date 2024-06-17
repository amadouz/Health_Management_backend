package com.sante.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sante.dao.PlaintesRepository;
import com.sante.entites.Plaintes;
import com.sante.services.PlaintesServices;
@Service
public class PlaintesServicesImp implements PlaintesServices {

	@Autowired
	private PlaintesRepository repository;
	@Override
	public Plaintes enregistrerPlainte(Plaintes plainte) {
		// TODO Auto-generated method stub
		return repository.save(plainte);
	}

	@Override
	public Plaintes modifierPlainte(Plaintes plainte) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(plainte);
	}

	@Override
	public List<Plaintes> listePlaintes() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Plaintes unePlainte(Long plainteId) {
		// TODO Auto-generated method stub
		return repository.findById(plainteId).orElseThrow();
	}

	@Override
	public void supprimerPlainte(Long plainteId) {
		// TODO Auto-generated method stub
		repository.deleteById(plainteId);
	}

	@Override
	public List<Plaintes> lesPlainteParConsultation(Long consultationId) {
		// TODO Auto-generated method stub
		return repository.lesPlaintesParconsultation(consultationId);
	}

}
