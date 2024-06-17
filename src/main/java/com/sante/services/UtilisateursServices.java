package com.sante.services;

import java.util.List;

import com.sante.entites.User;
import com.sante.entites.Utilisateurs;

public interface UtilisateursServices {

	Utilisateurs enregistrerUtilisateur(Utilisateurs utilisateur);
	
	Utilisateurs modifierUtilisateur(Utilisateurs utilisateur);
	
	List<Utilisateurs> listeUtilisateurs();
	
	Utilisateurs unUtilsateur(Long utilisateurId);
	
	void supprimerUtilisateur(Long utilisateurId);
	
	Utilisateurs activerUtilisateur(Utilisateurs user);
	
	Utilisateurs suspendreUtilisateur(Utilisateurs user);
	
	int activerService(Long serviceId);
	
	int suspendreService(Utilisateurs user);

	Utilisateurs findLogin(String username, String password);
	
	int nombreUser();

	Utilisateurs uneConnexion(String username);
}
