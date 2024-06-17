package com.sante.services;

import java.util.List;

import com.sante.entites.RendezVous;


public interface RendezVousServices {
	
    RendezVous enregistrerRdv(RendezVous rendezVous);
	
	RendezVous modifierRdv(RendezVous rendezVous);
	
	List<RendezVous> listeRendezVousPatient(Long patientID);
	
	List<RendezVous> listeRendezVousMedecin(Long medecinID);
	
	List<RendezVous> listeRendezVousServiceSante(Long serviceID);
	
	RendezVous unRendezVous(Long rendezVousId);
	
	void supprimerRendezVous(Long rendezVousId);

}
