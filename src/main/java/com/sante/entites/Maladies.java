package com.sante.entites;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Setter
@Getter
@Entity
public class Maladies implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String categorie; // groupe de maladie(spychologique , genetique)
	private String designation; // Nom de la maladie 
	private String type;  // Maladie hereditaire , non hereditaire,...
	private String transmission;  // mode de propagation
	private String coucheAge; 
	private String sexe; // HOMME FEMME
	private double tauxH; // taux d'exposition a la maladie pour Homme
	private double tauxF;  // taux d'exposition a la maladie pour Femme
	private double mortalite; // Pourcentage de mortalite
	private Date dateEnregistrement;
	public Maladies() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Maladies(Long id, String categorie, String designation, String type, String transmission, String coucheAge,
			String sexe, double tauxH, double tauxF, double mortalite, Date dateEnregistrement) {
		super();
		this.id = id;
		this.categorie = categorie;
		this.designation = designation;
		this.type = type;
		this.transmission = transmission;
		this.coucheAge = coucheAge;
		this.sexe = sexe;
		this.tauxH = tauxH;
		this.tauxF = tauxF;
		this.mortalite = mortalite;
		this.dateEnregistrement = dateEnregistrement;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public String getCoucheAge() {
		return coucheAge;
	}
	public void setCoucheAge(String coucheAge) {
		this.coucheAge = coucheAge;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public double getTauxH() {
		return tauxH;
	}
	public void setTauxH(double tauxH) {
		this.tauxH = tauxH;
	}
	public double getTauxF() {
		return tauxF;
	}
	public void setTauxF(double tauxF) {
		this.tauxF = tauxF;
	}
	public double getMortalite() {
		return mortalite;
	}
	public void setMortalite(double mortalite) {
		this.mortalite = mortalite;
	}
	public Date getDateEnregistrement() {
		return dateEnregistrement;
	}
	public void setDateEnregistrement(Date dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}
	
	
}
