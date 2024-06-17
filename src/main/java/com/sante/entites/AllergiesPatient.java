package com.sante.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Setter
@Getter
@Entity
public class AllergiesPatient implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="patientId")
	private Patients patient;
	
	@ManyToOne
	@JoinColumn(name="medecinId")
	private AgentSante medecin;
	
	private String type;
	private String valeur;
	private String gravite;
	private Date dateEnregistrement;
	public AllergiesPatient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AllergiesPatient(Long id, Patients patient, AgentSante medecin, String type, String valeur, String gravite,
			Date dateEnregistrement) {
		super();
		this.id = id;
		this.patient = patient;
		this.medecin = medecin;
		this.type = type;
		this.valeur = valeur;
		this.gravite = gravite;
		this.dateEnregistrement = dateEnregistrement;
	}
	
	
	
	
}
