package com.sante.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sante.dao.AllergiesPatientRepository;
import com.sante.entites.AllergiesPatient;
import com.sante.services.AllergiesPatientsServices;

@Service
public class AllergiesPatientServiceImp implements AllergiesPatientsServices {

	@Autowired
	private AllergiesPatientRepository repository;
	
	@Override
	public AllergiesPatient enregistrerAllergiePatient(AllergiesPatient allergiePatient) {
		// TODO Auto-generated method stub
		return repository.save(allergiePatient);
	}

	@Override
	public AllergiesPatient modifierAllergiePatient(AllergiesPatient allergiePatient) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(allergiePatient);
	}

	@Override
	public List<AllergiesPatient> listeAllergiesPatient() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public AllergiesPatient uneAllergiePatient(Long allergiePatientId) {
		// TODO Auto-generated method stub
		return repository.findById(allergiePatientId).orElseThrow();
	}

	@Override
	public void supprimerAllergiePatient(Long allergiePatientId) {
		// TODO Auto-generated method stub
		 repository.deleteById(allergiePatientId);
	}

	@Override
	public List<AllergiesPatient> allergiesParPatient(Long patientId) {
		// TODO Auto-generated method stub
		return repository.allergiesPatient(patientId);
	}

}
