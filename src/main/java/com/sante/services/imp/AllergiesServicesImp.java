package com.sante.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sante.dao.AllergiesRepository;
import com.sante.entites.Allergies;
import com.sante.services.AllergiesServices;

@Service
public class AllergiesServicesImp implements AllergiesServices {

	@Autowired
	private AllergiesRepository repository;
	@Override
	public Allergies enregistrerAllergie(Allergies allergie) {
		// TODO Auto-generated method stub
		return repository.save(allergie);
	}

	@Override
	public Allergies modifierAllergie(Allergies allergie) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(allergie);
	}

	@Override
	public List<Allergies> listeAllergies() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Allergies uneAllergie(Long allergieId) {
		// TODO Auto-generated method stub
		return repository.findById(allergieId).orElseThrow();
	}

	@Override
	public void supprimerAllergie(Long allergieId) {
		// TODO Auto-generated method stub
		repository.deleteById(allergieId);
	}

	@Override
	public Allergies lesAllergie(Long patientId) {
		// TODO Auto-generated method stub
		return repository.lesAllergies(patientId);
	}

}
