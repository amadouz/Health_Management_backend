package com.sante.entites;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Traitements implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="MedecinId")
	private AgentSante agent;
	
	@OneToOne
	@JoinColumn(name="PatientId")
	private Patients patient;
	
	private String nom;
	private String categorie;
	private Date dateEntree;
	private Date dateSortie;
	private String conclusion;
	private Date rendezVous;
	public Traitements() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Traitements(AgentSante agent, Patients patient, Long id, String nom, String categorie, Date dateEntree,
			Date dateSortie, String conclusion, Date rendezVous) {
		super();
		this.agent = agent;
		this.patient = patient;
		this.id = id;
		this.nom = nom;
		this.categorie = categorie;
		this.dateEntree = dateEntree;
		this.dateSortie = dateSortie;
		this.conclusion = conclusion;
		this.rendezVous = rendezVous;
	}
	public AgentSante getAgent() {
		return agent;
	}
	public void setAgent(AgentSante agent) {
		this.agent = agent;
	}
	public Patients getPatient() {
		return patient;
	}
	public void setPatient(Patients patient) {
		this.patient = patient;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public Date getDateEntree() {
		return dateEntree;
	}
	public void setDateEntree(Date dateEntree) {
		this.dateEntree = dateEntree;
	}
	public Date getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}
	public String getConclusion() {
		return conclusion;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	public Date getRendezVous() {
		return rendezVous;
	}
	public void setRendezVous(Date rendezVous) {
		this.rendezVous = rendezVous;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
