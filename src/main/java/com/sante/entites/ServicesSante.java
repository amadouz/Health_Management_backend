package com.sante.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
@Entity
public class ServicesSante implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	/*@OneToMany(mappedBy="service")
	private List<AgentSante> agentSante;*/
	
	@OneToOne
	@JoinColumn(name="adresseId")
	private Adresses adresse;
	
	private String nom;  // Nom du service
	private String type; // Type de service ( HOPITAL,PHARMACIE,ONG)
	private Date dateCreation;
	private String logo; // Nom de l'image du service
	public ServicesSante() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*public ServicesSante(Long id, List<AgentSante> agentSante, Adresses adresse, String nom, String type,
			Date dateCreation, String logo) {
		super();
		this.id = id;
		this.agentSante = agentSante;
		this.adresse = adresse;
		this.nom = nom;
		this.type = type;
		this.dateCreation = dateCreation;
		this.logo = logo;
	}*/
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	/*public List<AgentSante> getAgentSante() {
		return agentSante;
	}
	public void setAgentSante(List<AgentSante> agentSante) {
		this.agentSante = agentSante;
	}*/
	public Adresses getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresses adresse) {
		this.adresse = adresse;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public ServicesSante(Adresses adresse, String nom, String type, Date dateCreation, String logo) {
		super();
		this.adresse = adresse;
		this.nom = nom;
		this.type = type;
		this.dateCreation = dateCreation;
		this.logo = logo;
	}
		
}
