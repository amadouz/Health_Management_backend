package com.sante.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sante.dao.AdressesRepository;
import com.sante.entites.Adresses;
import com.sante.services.AdressesServices;

@Service
public class AdressesServicesImp implements AdressesServices {

	@Autowired
	private AdressesRepository repository;
	
	@Override
	public Adresses enregistrerAdresse(Adresses adresse){
		// TODO Auto-generated method stub
		return repository.save(adresse);
	}

	@Override
	public Adresses modifierAdresse(Adresses adresse) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(adresse);
	}

	@Override
	public List<Adresses> listeAdresses() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Adresses uneAdresse(Long adresseId) {
		// TODO Auto-generated method stub
		return repository.unSecteur(adresseId);
	}

	@Override
	public void supprimerAdresse(Long adresseId) {
		// TODO Auto-generated method stub
		repository.deleteById(adresseId);
	}

	@Override
	public boolean foundAdresse(Long id) {
		// TODO Auto-generated method stub
		int nb = repository.nbAdresse(id);
		if(nb>=1) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public List<Object> lesPays() {
		// TODO Auto-generated method stub
		return repository.paysRegion();
	}
}
