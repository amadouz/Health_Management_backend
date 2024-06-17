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
public class ResultatExamens implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="parametreId")
	private ParametresExamens paramExam;
	
	@OneToOne
	@JoinColumn(name="laborantinId")
	private AgentSante laborantin;
		
	private String categorie;
	private String designation;
	private String valNorm1;
	private String valNorm2;
	private String resultat;
	private String unite;
	private Date dateResultat; 
	public ResultatExamens() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResultatExamens(Long id, ParametresExamens paramExam, AgentSante laborantin, String categorie,
			String designation, String valNorm1, String valNorm2, String resultat, String unite, Date dateResultat) {
		super();
		this.id = id;
		this.paramExam = paramExam;
		this.laborantin = laborantin;
		this.categorie = categorie;
		this.designation = designation;
		this.valNorm1 = valNorm1;
		this.valNorm2 = valNorm2;
		this.resultat = resultat;
		this.unite = unite;
		this.dateResultat = dateResultat;
	}	
}
