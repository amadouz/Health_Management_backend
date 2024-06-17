package com.sante.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sante.dao.TraitementsRepository;
import com.sante.entites.Traitements;
import com.sante.services.TraitementsServices;

@Service
public class TraitementsServicesImp implements TraitementsServices {

	@Autowired
	private TraitementsRepository repository;
	
	@Override
	public Traitements enregisterTraitement(Traitements traitement) {
		// TODO Auto-generated method stub
		return repository.save(traitement);
	}

	@Override
	public Traitements modifierTraitement(Traitements traitement) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(traitement);
	}

	@Override
	public List<Traitements> listeTraitement() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Traitements unTraitement(Long traitementId) {
		// TODO Auto-generated method stub
		return repository.findById(traitementId).orElseThrow();
	}

	@Override
	public void supprimerTraitement(Long traitementId) {
		// TODO Auto-generated method stub
		repository.deleteById(traitementId);
	}

	@Override
	public List<String> traitementsParPatient(Long patientId) {
		// TODO Auto-generated method stub
		return repository.traitementPatient(patientId);
	}

}
