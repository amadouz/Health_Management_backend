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
public class Patients implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="adresseId")
	private Adresses adresse;
	
	@OneToOne
	@JoinColumn(name="compteId")
	private Utilisateurs utilisateur;
	
	/*@OneToMany(mappedBy="patient")
	private List<AllergiesPatient> allergies;
	
	@OneToMany(mappedBy="patient")
	private List<CaracteristiquePatients> caracteristiquePatient;
	
	@OneToMany(mappedBy="patient")
	private List<Consultations> consultation;
	
	@OneToMany(mappedBy="patient")
	private List<MaladiesPatients> maladies;
	*/
	private String nom;
	private String prenom;
	private String genre;
	private Date naissance;
	private String lieuNaissance;
	private String telephone;
	private String profession;
	private String email;
	private String numero;  // Numero secutite de sante (code unique)
	private String photo;
	private String parentF;
	private String numeroF;
	private String parentM;
	private String numeroM;
	private Date inscription;
	public Patients() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patients(Long id, Adresses adresse, Utilisateurs utilisateur, String nom, String prenom, String genre,
			Date naissance, String lieuNaissance, String telephone, String profession, String email, String numero,
			String photo, String parentF, String numeroF, String parentM, String numeroM, Date inscription) {
		super();
		this.id = id;
		this.adresse = adresse;
		this.utilisateur = utilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.naissance = naissance;
		this.lieuNaissance = lieuNaissance;
		this.telephone = telephone;
		this.profession = profession;
		this.email = email;
		this.numero = numero;
		this.photo = photo;
		this.parentF = parentF;
		this.numeroF = numeroF;
		this.parentM = parentM;
		this.numeroM = numeroM;
		this.inscription = inscription;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Date getNaissance() {
		return naissance;
	}
	public void setNaissance(Date naissance) {
		this.naissance = naissance;
	}
	public String getLieuNaissance() {
		return lieuNaissance;
	}
	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getParentF() {
		return parentF;
	}
	public void setParentF(String parentF) {
		this.parentF = parentF;
	}
	public String getNumeroF() {
		return numeroF;
	}
	public void setNumeroF(String numeroF) {
		this.numeroF = numeroF;
	}
	public String getParentM() {
		return parentM;
	}
	public void setParentM(String parentM) {
		this.parentM = parentM;
	}
	public String getNumeroM() {
		return numeroM;
	}
	public void setNumeroM(String numeroM) {
		this.numeroM = numeroM;
	}
	public Date getInscription() {
		return inscription;
	}
	public void setInscription(Date inscription) {
		this.inscription = inscription;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
