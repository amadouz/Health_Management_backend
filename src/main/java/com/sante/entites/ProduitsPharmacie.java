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
public class ProduitsPharmacie implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="pharmacieId")
	private ServicesSante pharmacie;
	
	private String categorie;
	private String designation;
	private String code;
	private Date dateProduction;
	private Date dateExpiration;
	private double prix;
	private double quantite;
	private String image;
	private String consommation;
	public ProduitsPharmacie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProduitsPharmacie(Long id, ServicesSante pharmacie, String categorie, String designation, String code,
			Date dateProduction, Date dateExpiration, double prix, double quantite, String image, String consommation) {
		super();
		this.id = id;
		this.pharmacie = pharmacie;
		this.categorie = categorie;
		this.designation = designation;
		this.code = code;
		this.dateProduction = dateProduction;
		this.dateExpiration = dateExpiration;
		this.prix = prix;
		this.quantite = quantite;
		this.image = image;
		this.consommation = consommation;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ServicesSante getPharmacie() {
		return pharmacie;
	}
	public void setPharmacie(ServicesSante pharmacie) {
		this.pharmacie = pharmacie;
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Date getDateProduction() {
		return dateProduction;
	}
	public void setDateProduction(Date dateProduction) {
		this.dateProduction = dateProduction;
	}
	public Date getDateExpiration() {
		return dateExpiration;
	}
	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public double getQuantite() {
		return quantite;
	}
	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getConsommation() {
		return consommation;
	}
	public void setConsommation(String consommation) {
		this.consommation = consommation;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
