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
public class Deces implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="patientId")
	private Patients patient;
	
	@OneToOne
	@JoinColumn(name="medecinId")
	private AgentSante medecin;
	
	private String type;
	private Date dateDeces;
	private Date dateEnregistrement;
	public Deces() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Deces(Long id, Patients patient, AgentSante medecin, String type, Date dateDeces, Date dateEnregistrement) {
		super();
		this.id = id;
		this.patient = patient;
		this.medecin = medecin;
		this.type = type;
		this.dateDeces = dateDeces;
		this.dateEnregistrement = dateEnregistrement;
	}
}
