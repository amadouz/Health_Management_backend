package com.sante.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sante.dao.MaladiesRepository;
import com.sante.entites.Maladies;
import com.sante.services.MaladiesServices;

@Service
public class MaladiesServicesImp implements MaladiesServices {

	@Autowired
	private MaladiesRepository repository;
	
	@Override
	public Maladies enregistrerMaladie(Maladies maladie) {
		// TODO Auto-generated method stub
		return repository.save(maladie);
	}

	@Override
	public Maladies modifierMaladie(Maladies maladie) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(maladie);
	}

	@Override
	public List<Maladies> listeMaladies() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Maladies uneMaladie(Long maladieId) {
		// TODO Auto-generated method stub
		return repository.findById(maladieId).orElseThrow();
	}

	@Override
	public void supprimerMaladie(Long maladieId) {
		// TODO Auto-generated method stub
		repository.deleteById(maladieId);
	}
}
