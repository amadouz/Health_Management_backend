package com.sante.services.imp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.sante.dao.ParametresRepository;
import com.sante.entites.Parametres;
import com.sante.services.ParametresServices;

@Service
public class ParametresServicesImp implements ParametresServices {

	@Autowired
	private ParametresRepository repository;
	@Override
	public Parametres enregistrerParametre(Parametres parametre) {
		// TODO Auto-generated method stub
		return repository.save(parametre);
	}

	@Override
	public Parametres modifierParametre(Parametres parametre) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(parametre);
	}

	@Override
	public List<Parametres> listeParametres() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Parametres unParametre(@PathVariable(name="parametreId") Long parametreId) {
		// TODO Auto-generated method stub
		return repository.findById(parametreId).orElseThrow();
	}

	@Override
	public void supprimerParametre(Long parametreId) {
		// TODO Auto-generated method stub
		repository.deleteById(parametreId);
	}

}
