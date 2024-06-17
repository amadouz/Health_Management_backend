package com.sante.services;

import java.util.List;


import com.sante.entites.Parametres;

public interface ParametresServices {

	Parametres enregistrerParametre(Parametres parametre);
	
	Parametres modifierParametre(Parametres parametre);
	
	List<Parametres> listeParametres();
	
	Parametres unParametre(Long parametreId);
	
	void supprimerParametre(Long parametreId);
	
}
