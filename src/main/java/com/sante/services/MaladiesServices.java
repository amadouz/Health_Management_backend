package com.sante.services;

import java.util.List;

import com.sante.entites.Maladies;

public interface MaladiesServices {
	
	Maladies enregistrerMaladie(Maladies maladie);
	
	Maladies modifierMaladie(Maladies maladie);
	
	List<Maladies> listeMaladies();
	
	Maladies uneMaladie(Long maladieId);
	
	void supprimerMaladie(Long maladieId);
}
