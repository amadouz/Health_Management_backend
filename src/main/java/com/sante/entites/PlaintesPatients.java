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
public class PlaintesPatients implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="consultationId")
	private Consultations consultation;
	
	private String designation;
	double duree;
	private String unite; // (HEURE,JOUR)
	private String intensite;
	private String localisation;
	private String frequence;
	private String cause;  // plusieurs causes
	private Date dateEnregistrement;
	public PlaintesPatients() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PlaintesPatients(Long id, Consultations consultation, String designation, double duree, String unite,
			String intensite, String localisation, String frequence, String cause, Date dateEnregistrement) {
		super();
		this.id = id;
		this.consultation = consultation;
		this.designation = designation;
		this.duree = duree;
		this.unite = unite;
		this.intensite = intensite;
		this.localisation = localisation;
		this.frequence = frequence;
		this.cause = cause;
		this.dateEnregistrement = dateEnregistrement;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Consultations getConsultation() {
		return consultation;
	}
	public void setConsultation(Consultations consultation) {
		this.consultation = consultation;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getDuree() {
		return duree;
	}
	public void setDuree(double duree) {
		this.duree = duree;
	}
	public String getUnite() {
		return unite;
	}
	public void setUnite(String unite) {
		this.unite = unite;
	}
	public String getIntensite() {
		return intensite;
	}
	public void setIntensite(String intensite) {
		this.intensite = intensite;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	public String getFrequence() {
		return frequence;
	}
	public void setFrequence(String frequence) {
		this.frequence = frequence;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public Date getDateEnregistrement() {
		return dateEnregistrement;
	}
	public void setDateEnregistrement(Date dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}
	
}
