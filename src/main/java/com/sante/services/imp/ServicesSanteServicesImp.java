package com.sante.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sante.dao.ServicesSanteRepository;
import com.sante.entites.ServicesSante;
import com.sante.services.ServicesSanteServices;

@Service
public class ServicesSanteServicesImp implements ServicesSanteServices {

	@Autowired 
	private ServicesSanteRepository repository;
	
	@Override
	public ServicesSante enregistrerServiceSante(ServicesSante serviceSante) {
		// TODO Auto-generated method stub
		return repository.save(serviceSante);
	}

	@Override
	public ServicesSante modifierServiceSante(ServicesSante servicesSante) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(servicesSante);
	}

	@Override
	public List<ServicesSante> ListeServiceSante() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public ServicesSante unServiceSante(Long serviceSanteId) {
		// TODO Auto-generated method stub
		return repository.findById(serviceSanteId).orElseThrow();
	}

	@Override
	public void supprimerServiceSante(Long serviceSanteId) {
		// TODO Auto-generated method stub
		repository.deleteById(serviceSanteId);
	}

}
