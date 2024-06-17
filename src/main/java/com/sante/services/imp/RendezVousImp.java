package com.sante.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sante.dao.RendezVousRepository;
import com.sante.entites.RendezVous;
import com.sante.services.RendezVousServices;

@Service
public class RendezVousImp implements RendezVousServices {
    
	@Autowired
	private RendezVousRepository  repository;
	
	@Override
	public RendezVous enregistrerRdv(RendezVous rendezVous) {
		// TODO Auto-generated method stub
		return repository.save(rendezVous);
	}

	@Override
	public RendezVous modifierRdv(RendezVous rendezVous) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(rendezVous);
	}

	@Override
	public List<RendezVous> listeRendezVousPatient(Long patientId) {
		// TODO Auto-generated method stub
		return repository.getByPatient(patientId);
	}

	@Override
	public List<RendezVous> listeRendezVousMedecin(Long medecinId) {
		// TODO Auto-generated method stub
		return repository.getByMedecin(medecinId);
	}

	@Override
	public List<RendezVous> listeRendezVousServiceSante(Long serviceId) {
		// TODO Auto-generated method stub
		return repository.getByIdService(serviceId);
	}

	@Override
	public RendezVous unRendezVous(Long rendezVousId) {
		// TODO Auto-generated method stub
		return repository.getById(rendezVousId);
	}

	@Override
	public void supprimerRendezVous(Long rendezVousId) {
		// TODO Auto-generated method stub
		repository.deleteById(rendezVousId);
	}

}
