package com.sante.services;

import java.util.List;


import com.sante.entites.AgentSante;

public interface AgentSanteServices {
	
	AgentSante enregistrerAgent(AgentSante agent);
	
	AgentSante modifierAgent(AgentSante agent);
	
	List<AgentSante> listeAgents();
	
	AgentSante unAgent(Long agentId);
	
	void supprimerAgent(Long agentId);
	
	List<String> agentParProfOuSer(String valeur);

	AgentSante unAgentInfo(Long idUtilisateur);

	List<AgentSante> lesResponsables(Long idService);
}
