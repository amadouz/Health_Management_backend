package com.sante.entites;

import java.io.Serializable;

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
public class Parametres implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String categorie;
	private String designation;
	private String valNormH1;
	private String valNormH2;
	private String valNormF1;
	private String valNormF2;
	public Parametres() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Parametres(Long id, String categorie, String designation, String valNormH1, String valNormH2,
			String valNormF1, String valNormF2) {
		super();
		this.id = id;
		this.categorie = categorie;
		this.designation = designation;
		this.valNormH1 = valNormH1;
		this.valNormH2 = valNormH2;
		this.valNormF1 = valNormF1;
		this.valNormF2 = valNormF2;
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
	public String getValNormH1() {
		return valNormH1;
	}
	public void setValNormH1(String valNormH1) {
		this.valNormH1 = valNormH1;
	}
	public String getValNormH2() {
		return valNormH2;
	}
	public void setValNormH2(String valNormH2) {
		this.valNormH2 = valNormH2;
	}
	public String getValNormF1() {
		return valNormF1;
	}
	public void setValNormF1(String valNormF1) {
		this.valNormF1 = valNormF1;
	}
	public String getValNormF2() {
		return valNormF2;
	}
	public void setValNormF2(String valNormF2) {
		this.valNormF2 = valNormF2;
	}
	
}
