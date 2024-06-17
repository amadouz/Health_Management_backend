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
public class Ordonnances implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="consultationId")
	private Consultations consultation;
	
	private String categorie;
	private String designation;
	private String code;
	private int quantite;
	private String image;
	private String consommation;
	private Date datePrescription;
	
	
	public Ordonnances(Long id, Consultations consultation, String categorie, String designation, String code,
			int quantite, String image, String consommation, Date datePrescription) {
		super();
		this.id = id;
		this.consultation = consultation;
		this.categorie = categorie;
		this.designation = designation;
		this.code = code;
		this.quantite = quantite;
		this.image = image;
		this.consommation = consommation;
		this.datePrescription = datePrescription;
	}


	public Ordonnances() {
		super();
		// TODO Auto-generated constructor stub
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	}