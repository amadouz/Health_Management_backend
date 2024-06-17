package com.sante.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


import com.sante.entites.AgentSante;
import com.sante.services.AgentSanteServices;
import com.sante.services.FileStorageServices;

@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("agentSantes")
@RestController
public class AgentSanteController {
	
	@Autowired
	private AgentSanteServices agentSanteServices;
	private FileStorageServices fileStorageService;
	
	@PostMapping("/save")
	public AgentSante save(@RequestBody AgentSante agent) {
		return agentSanteServices.enregistrerAgent(agent);
	}
	
	@PutMapping("/update")
	public AgentSante update(@RequestBody AgentSante agent) {
		return agentSanteServices.modifierAgent(agent);
	}
	
	
	@GetMapping("/all")
	public List<AgentSante> all(){
		return agentSanteServices.listeAgents();
	}
	
	
	@GetMapping("/agentsante/{agentId}")
	public AgentSante getAgent(@PathVariable(name="agentId") Long agentId) {
		return agentSanteServices.unAgent(agentId);
	}
	
	@GetMapping("/agentSanteInfo/{idUtilisateur}")
	public AgentSante getAgentInfo(@PathVariable(name="idUtilisateur") Long idUtilisateur) {
		return agentSanteServices.unAgentInfo(idUtilisateur);
	}
	
	@DeleteMapping("/delete/{agentId}")
	public void delete(@PathVariable(name = "agentId") Long agentId) {
		agentSanteServices.supprimerAgent(agentId);
	}
	
	@GetMapping("/agentParSerProf/{valeur}")
	public List<String> agentParSerProf(@PathVariable(name="valeur") String valeur){
		return agentSanteServices.agentParProfOuSer(valeur);
	}
	@GetMapping("/responsablesService/{idService}")
	public List<AgentSante> getResponsables(@PathVariable(name="idService") Long idService) {
		return agentSanteServices.lesResponsables(idService);
	}
	
	@PostMapping("/upload")
	  public String uploadFile(@RequestParam("file") MultipartFile file) {
	    String message = "";
	    try {
	    	fileStorageService.save(file);

	      message = "Uploaded the file successfully: " + file.getOriginalFilename();
	      return "suceess";
	    } catch (Exception e) {
	      message = "Could not upload the file: " + file.getOriginalFilename() + "!";
	      return "Error";
	    }
	 }
}
