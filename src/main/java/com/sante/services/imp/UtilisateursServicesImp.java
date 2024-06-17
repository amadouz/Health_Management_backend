package com.sante.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sante.dao.UtilisateursRepository;
import com.sante.entites.Utilisateurs;
import com.sante.services.UtilisateursServices;

@Service
public class UtilisateursServicesImp implements UtilisateursServices {

	@Autowired
	private UtilisateursRepository repository;
	
	@Override
	public Utilisateurs enregistrerUtilisateur(Utilisateurs utilisateur) {
		// TODO Auto-generated method stub
		return repository.save(utilisateur);
	}

	@Override
	public Utilisateurs modifierUtilisateur(Utilisateurs utilisateur) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(utilisateur);
	}

	@Override
	public List<Utilisateurs> listeUtilisateurs() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Utilisateurs unUtilsateur(Long utilisateurId) {
		// TODO Auto-generated method stub
		return repository.findById(utilisateurId).orElseThrow();
	}

	@Override
	public void supprimerUtilisateur(Long utilisateurId) {
		// TODO Auto-generated method stub
		repository.deleteById(utilisateurId);
	}

	@Override
	public Utilisateurs activerUtilisateur(Utilisateurs user) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(user);
	}

	@Override
	public Utilisateurs suspendreUtilisateur(Utilisateurs user) {
		return repository.saveAndFlush(user);
	}

	@Override
	public int activerService(Long serviceId) {
		// TODO Auto-generated method stub
		return repository.activerService(serviceId);
	}

	/*@Override
	public int suspendreService(Long serviceId) {
		// TODO Auto-generated method stub
		return repository.suspendreService(serviceId);
	}*/

	@Override
	public Utilisateurs findLogin(String username, String password) {
		// TODO Auto-generated method stub
		return repository.findUser(username, password);
	}

	@Override
	public int nombreUser() {
		// TODO Auto-generated method stub
		return repository.countUser();
	}

	@Override
	public int suspendreService(Utilisateurs user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Utilisateurs uneConnexion(String username) {
		// TODO Auto-generated method stub
		return repository.findAllByUsername(username);
	}

	

}
