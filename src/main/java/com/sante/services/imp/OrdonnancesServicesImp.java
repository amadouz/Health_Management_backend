package com.sante.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sante.dao.OrdonnancesRepository;
import com.sante.entites.Ordonnances;
import com.sante.services.OrdonnancesServices;

@Service
public class OrdonnancesServicesImp implements OrdonnancesServices {

	@Autowired
	private OrdonnancesRepository repository;
	
	@Override
	public Ordonnances enregistrerOrdonnance(Ordonnances ordonnance) {
		// TODO Auto-generated method stub
		return repository.save(ordonnance);
	}

	@Override
	public Ordonnances modifierOrdonnance(Ordonnances ordonnance) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(ordonnance);
	}

	@Override
	public List<Ordonnances> listeOrdonnances() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Ordonnances uneOrdonnace(Long ordonnaceId) {
		// TODO Auto-generated method stub
		return repository.findById(ordonnaceId).orElseThrow();
	}

	@Override
	public void supprimerOrdonnance(Long ordonnanceId) {
		// TODO Auto-generated method stub
		repository.deleteById(ordonnanceId);

	}

	@Override
	public List<Ordonnances> ordonnanceParConsultation(Long consultationId) {
		// TODO Auto-generated method stub
		return repository.ordonnanceConsultation(consultationId);
	}

}
