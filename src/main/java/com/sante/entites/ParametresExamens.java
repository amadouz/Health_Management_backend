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
public class ParametresExamens implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="consultationId")
	private Consultations consultation;
	
	private String categorie;
	private String designation;
	private String valNorm1;
	private String valNorm2;
	private String unite;
	private Date dateDemande;
	private String traite;
	public ParametresExamens() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ParametresExamens(Long id, Consultations consultation, String categorie, String designation, String valNorm1,
			String valNorm2, String unite, Date dateDemande, String traite) {
		super();
		this.id = id;
		this.consultation = consultation;
		this.categorie = categorie;
		this.designation = designation;
		this.valNorm1 = valNorm1;
		this.valNorm2 = valNorm2;
		this.unite = unite;
		this.dateDemande = dateDemande;
		this.traite = traite;
	}
	
}
