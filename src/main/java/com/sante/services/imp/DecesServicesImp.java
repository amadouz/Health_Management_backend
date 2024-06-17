package com.sante.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sante.dao.DecesRepository;
import com.sante.entites.Deces;
import com.sante.services.DecesServices;

@Service
public class DecesServicesImp implements DecesServices {

	@Autowired
	private DecesRepository repository;
	@Override
	public Deces enregistrerDeces(Deces deces) {
		// TODO Auto-generated method stub
		return repository.save(deces);
	}

	@Override
	public Deces modifierDeces(Deces deces) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(deces);
	}

	@Override
	public List<Deces> listeDeces() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Deces unDeces(Long decesId) {
		// TODO Auto-generated method stub
		return repository.findById(decesId).orElseThrow();
	}

	@Override
	public void supprimerDeces(Long decesId) {
		// TODO Auto-generated method stub
		repository.deleteById(decesId);
	}

	@Override
	public Deces DecesPatient(Long patientId) {
		// TODO Auto-generated method stub
		return repository.decesDuPatient(patientId);
	}

	@Override
	public void supprimerDecesPatient(Long patientId) {
		// TODO Auto-generated method stub
		repository.supprimerUnDeces(patientId);
	}

}
