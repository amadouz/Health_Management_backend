package com.sante.entites;


import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Setter
@Getter
@Entity
@Table(name="Adresses")
public class Adresses implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="pays")
	private String pays;
	
	@Column(name="region")
	private String region;
	
	@Column(name="commune")
	private String commune;
	
	@Column(name="quartier")
	private String quartier;
	
	@Column(name="secteur")
	private String secteur;
	
	@Column(name="dateEnregistrement")
	private Date dateEnregistrement;
	
	
	public Adresses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Adresses(Long id, String pays, String region, String commune, String quartier, String secteur,
			Date dateEnregistrement) {
		super();
		this.id = id;
		this.pays = pays;
		this.region = region;
		this.commune = commune;
		this.quartier = quartier;
		this.secteur = secteur;
		this.dateEnregistrement = dateEnregistrement;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCommune() {
		return commune;
	}
	public void setCommune(String commune) {
		this.commune = commune;
	}
	public String getQuartier() {
		return quartier;
	}
	public void setQuartier(String quartier) {
		this.quartier = quartier;
	}
	public String getSecteur() {
		return secteur;
	}
	public void setSecteur(String secteur) {
		this.secteur = secteur;
	}
	public Date getDateEnregistrement() {
		return dateEnregistrement;
	}
	public void setDateEnregistrement(Date dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}	
}
