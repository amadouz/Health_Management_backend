package com.sante.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sante.dao.AdressesRepository;
import com.sante.dao.AgentSanteRepository;
import com.sante.dao.ServicesSanteRepository;
import com.sante.dao.UtilisateursRepository;
import com.sante.entites.AgentSante;
import com.sante.services.AgentSanteServices;
import com.sante.services.UtilisateursServices;

@Service
public class AgentSanteServicesImp implements AgentSanteServices {

	@Autowired
	private AgentSanteRepository repository;
	
	/*@Autowired
	private UtilisateursRepository repositoryUser;	
	*/
	@Override
	public AgentSante enregistrerAgent(AgentSante agent) {
		// TODO Auto-generated method stub
		return repository.save(agent);
	}

	@Override
	public AgentSante modifierAgent(AgentSante agent) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(agent);
	}

	@Override
	public List<AgentSante> listeAgents() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public AgentSante unAgent(Long agentId) {
		// TODO Auto-generated method stub
		return repository.findById(agentId).orElseThrow();
	}

	@Override
	public void supprimerAgent(Long agentId) {
		// TODO Auto-generated method stub
		repository.deleteById(agentId);
			
	}

	@Override
	public List<String> agentParProfOuSer(String valeur) {
		// TODO Auto-generated method stub
		return repository.AgentProfessionService(valeur);
	}

	@Override
	public AgentSante unAgentInfo(Long idUtilisateur) {
		// TODO Auto-generated method stub
		return repository.unAgentInfo(idUtilisateur);
	}

	@Override
	public List<AgentSante> lesResponsables(Long idService) {
		// TODO Auto-generated method stub
		return repository.getResponsables(idService);
	}
}
