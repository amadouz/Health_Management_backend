package com.sante.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sante.dao.CaracteristiquesPatientsRepository;
import com.sante.entites.CaracteristiquePatients;
import com.sante.services.CaracteristiquePatientsServices;

@Service
public class CaracteristiquePatientsServicesImp implements CaracteristiquePatientsServices {

	@Autowired
	private CaracteristiquesPatientsRepository repository;
	@Override
	public CaracteristiquePatients enregisterCaracteristique(CaracteristiquePatients caracteristique) {
		// TODO Auto-generated method stub
		return repository.save(caracteristique);
	}

	@Override
	public CaracteristiquePatients modifierCaracteristique(CaracteristiquePatients caracteristique) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(caracteristique);
	}

	@Override
	public List<CaracteristiquePatients> listeCarateristiques() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public CaracteristiquePatients uneCaracteristique(Long caracteristiqueId) {
		// TODO Auto-generated method stub
		return repository.findById(caracteristiqueId).orElseThrow();
	}

	@Override
	public void supprimerCaracteristique(Long caracteristiqueId) {
		// TODO Auto-generated method stub
		repository.deleteById(caracteristiqueId);
	}

	@Override
	public List<CaracteristiquePatients> carateristiqueParPatient(Long patientId) {
		// TODO Auto-generated method stub
		return repository.caracteristiquePatient(patientId)
				;
	}

}
