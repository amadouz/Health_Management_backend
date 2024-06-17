package com.sante.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
public class Consultations implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="PatientId")
	private Patients patient;
	
	
	@ManyToOne
	@JoinColumn(name="medecinId")
	private AgentSante medecin;
	
	
	/*@OneToMany(mappedBy="consultation")
	private List<ParametresExamens> paramExam;
	
	@OneToMany(mappedBy="consultation")
	private List<PlaintesPatients> plainte;*/
	
	private String code;
	private Date dateConsultation;
	private Date rendezVous;
	public Consultations() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Consultations(Long id, Patients patient, AgentSante medecin, String code, Date dateConsultation, Date rendezVous) {
		super();
		this.id = id;
		this.patient = patient;
		this.medecin = medecin;
		this.code = code;
		this.dateConsultation = dateConsultation;
		this.rendezVous = rendezVous;
	}
	
	
	
}
