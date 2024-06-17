package com.sante.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
@Entity
public class MaladiesPatients implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="consultationId")
	private Consultations consultation;
	
	private String categorie; // groupe de maladie(spychologique , genetique)
	private String designation; // Nom de la maladie 
	private double taux; // taux d'exposition a la maladie pour Homme
	private String etatMaladie; // Gravite de la maladie pour le patient
	private Date dateDebut; // Estimation de debut de la  maladie
	private String etatActu;
	private Date dateEnregistrement;
	public MaladiesPatients() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MaladiesPatients(Long id, Consultations consultation, String categorie, String designation, double taux,
			String etatMaladie, Date dateDebut, String etatActu, Date dateEnregistrement) {
		super();
		this.id = id;
		this.consultation = consultation;
		this.categorie = categorie;
		this.designation = designation;
		this.taux = taux;
		this.etatMaladie = etatMaladie;
		this.dateDebut = dateDebut;
		this.etatActu = etatActu;
		this.dateEnregistrement = dateEnregistrement;
	}
	
	
}
