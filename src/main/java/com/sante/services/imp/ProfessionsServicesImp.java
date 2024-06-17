package com.sante.services.imp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sante.dao.ProfessionsRepository;
import com.sante.entites.Professions;
import com.sante.services.ProfessionsServices;



@Service
public class ProfessionsServicesImp implements ProfessionsServices {
	
	@Autowired
	private ProfessionsRepository repository;
	
	@Override
	public Professions enregistrerProfession(Professions profession) {
		// TODO Auto-generated method stub
		return repository.save(profession);
	}

	@Override
	public Professions modifierProfession(Professions profession) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(profession);
	}

	@Override
	public List<Professions> listeProfessions() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Professions uneProfession(Long professionId) {
		// TODO Auto-generated method stub
		return repository.findById(professionId).orElseThrow();
	}

	@Override
	public void supprimerProfession(Long professionId) {
		// TODO Auto-generated method stub
		repository.deleteById(professionId);
	}

}
