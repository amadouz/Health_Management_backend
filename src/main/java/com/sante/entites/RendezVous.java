package com.sante.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
@Entity
public class RendezVous implements  Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="patientId")
	private Patients patient;
	
	@OneToOne
	@JoinColumn(name="serviceId")
	private ServicesSante service;
	
	@OneToOne
	@JoinColumn(name="medecinId")
	private AgentSante medecin;
	
	private String notePatient;
	private String noteMedecin;
	private Date dateRendezVous;
	private String etat;
	private String type;
	
	public RendezVous() {
		super();
	}

	public RendezVous(Long id, Patients patient, ServicesSante service, AgentSante medecin, String notePatient,
			String noteMedecin, Date dateRendezVous, String etat, String type) {
		super();
		this.id = id;
		this.patient = patient;
		this.service = service;
		this.medecin = medecin;
		this.notePatient = notePatient;
		this.noteMedecin = noteMedecin;
		this.dateRendezVous = dateRendezVous;
		this.etat = etat;
		this.type = type;
	}
	
	
	
	

}
