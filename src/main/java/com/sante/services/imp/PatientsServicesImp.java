package com.sante.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sante.dao.PatientsRepository;
import com.sante.entites.Patients;
import com.sante.services.PatientsServices;

@Service
public class PatientsServicesImp implements PatientsServices {

	@Autowired
	private PatientsRepository repository;
	@Override
	public Patients enregistrerPatient(Patients patient) {
		// TODO Auto-generated method stub
		return repository.save(patient);
	}

	@Override
	public Patients modifierPatient(Patients patient) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(patient);
	}

	@Override
	public List<Patients> listePatients() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Patients unPatient(Long patientId) {
		// TODO Auto-generated method stub
		return repository.findByIdPatient(patientId);
	}

	@Override
	public void supprimerPatient(Long patientId) {
		// TODO Auto-generated method stub
		repository.deleteById(patientId);
	}
	
	@Override
	public Patients infoPatient(Long idcompte) {
		return repository.affichePatient(idcompte);
	}

	@Override
	public Patients lePatient(String username) {
		// TODO Auto-generated method stub
		return repository.lePatient(username);
	}

}
