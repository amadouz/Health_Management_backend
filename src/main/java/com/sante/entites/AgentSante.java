package com.sante.entites;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Setter
@Getter
@Entity
public class AgentSante implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="serviceId")
	private ServicesSante service;
	
	/*@OneToMany(mappedBy="medecin")
	private List<Consultations> consultation;
	
	@OneToMany(mappedBy="laborantin")
	private List<ResultatExamens> resultatExam;*/
	
	@OneToOne
	@JoinColumn(name="AdresseId")
	private Adresses adresse;
	
	@OneToOne
	@JoinColumn(name="compteId")
	private Utilisateurs utilisateur;
	
	private String nom;
	private String prenom;
	private Date naissance;  // Date de naissance de l'agent AAAA/MM/JJ/
	private String LieuNaissance;
	private String genre;
	private String telephone; // +code du pays+numero
	private String email;
	private String profession; // Diplome
	private String fonction;  // Tache exercée
	private String photo;  // nom de la photo de l'agent
	private Date dateEnregistrement;
	public AgentSante() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*public AgentSante(Long id, ServicesSante service, List<Consultations> consultation,
			List<ResultatExamens> resultatExam, Adresses adresse, Utilisateurs utilisateur, String nom, String prenom,
			Date naissance, String lieuNaissance, String genre, String telephone, String email, String profession,
			String fonction, String photo, Date dateEnregistrement) {
		super();
		this.id = id;
		this.service = service;
		this.consultation = consultation;
		this.resultatExam = resultatExam;
		this.adresse = adresse;
		this.utilisateur = utilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.naissance = naissance;
		LieuNaissance = lieuNaissance;
		this.genre = genre;
		this.telephone = telephone;
		this.email = email;
		this.profession = profession;
		this.fonction = fonction;
		this.photo = photo;
		this.dateEnregistrement = dateEnregistrement;
	}*/
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ServicesSante getService() {
		return service;
	}
	public void setService(ServicesSante service) {
		this.service = service;
	}
	/*public List<Consultations> getConsultation() {
		return consultation;
	}
	public void setConsultation(List<Consultations> consultation) {
		this.consultation = consultation;
	}
	public List<ResultatExamens> getResultatExam() {
		return resultatExam;
	}
	public void setResultatExam(List<ResultatExamens> resultatExam) {
		this.resultatExam = resultatExam;
	}*/
	public Adresses getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresses adresse) {
		this.adresse = adresse;
	}
	public Utilisateurs getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateurs utilisateur) {
		this.utilisateur = utilisateur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getNaissance() {
		return naissance;
	}
	public void setNaissance(Date naissance) {
		this.naissance = naissance;
	}
	public String getLieuNaissance() {
		return LieuNaissance;
	}
	public void setLieuNaissance(String lieuNaissance) {
		LieuNaissance = lieuNaissance;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Date getDateEnregistrement() {
		return dateEnregistrement;
	}
	public void setDateEnregistrement(Date dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public AgentSante(ServicesSante service, Adresses adresse, Utilisateurs utilisateur, String nom, String prenom,
			Date naissance, String lieuNaissance, String genre, String telephone, String email, String profession,
			String fonction, String photo, Date dateEnregistrement) {
		super();
		this.service = service;
		this.adresse = adresse;
		this.utilisateur = utilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.naissance = naissance;
		LieuNaissance = lieuNaissance;
		this.genre = genre;
		this.telephone = telephone;
		this.email = email;
		this.profession = profession;
		this.fonction = fonction;
		this.photo = photo;
		this.dateEnregistrement = dateEnregistrement;
	}
}
