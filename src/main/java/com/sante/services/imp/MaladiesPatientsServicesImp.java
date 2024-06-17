package com.sante.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sante.dao.MaladiesPatientsRepository;
import com.sante.entites.MaladiesPatients;
import com.sante.services.MaladiesPatientsServices;

@Service
public class MaladiesPatientsServicesImp implements MaladiesPatientsServices {

	@Autowired
	private MaladiesPatientsRepository repository;
	
	@Override
	public MaladiesPatients enregisterMaladiesPatient(MaladiesPatients maladiePat) {
		// TODO Auto-generated method stub
		return repository.save(maladiePat);
	}

	@Override
	public MaladiesPatients modifierMaladiesPatient(MaladiesPatients maladiePat) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(maladiePat);
	}

	@Override
	public List<MaladiesPatients> listesMaladiesPatient() {
		// TODO Auto-generated method stub
		return repository.maladiesPatientAll();
	}

	@Override
	public MaladiesPatients uneMaladiePatient(Long maladiePatId) {
		// TODO Auto-generated method stub
		return repository.findById(maladiePatId).orElseThrow();
	}

	@Override
	public void supprimerMaladiePatient(Long maladiePatId) {
		// TODO Auto-generated method stub
		repository.deleteById(maladiePatId);
	}

	@Override
	public List<MaladiesPatients> maladiesParPatient(Long patientId) {
		// TODO Auto-generated method stub
		return repository.maladiesPatient(patientId);
	}

	@Override
	public List<MaladiesPatients> maladiesParConsultation(Long consultationId) {
		// TODO Auto-generated method stub
		return repository.maladiesParConsultation(consultationId);
	}

	/*@Override
	public List<MaladiesPatients> lesMaladiePatient(Long patientId) {
		// TODO Auto-generated method stub
		return repository.lesMaladiesParPatient(patientId);
	}*/

}
