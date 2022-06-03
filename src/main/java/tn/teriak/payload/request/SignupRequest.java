package tn.teriak.payload.request;

import java.util.Set;

import javax.validation.constraints.*;

public class SignupRequest {

	private String username;
	private String matricule;


	private String email;

	private String password;

	private String nom;

	private String prenom;
	private String signataire;

	private String date_naissance;
	private String recrutement;
	private String service;
	private String EmailConfirmed;
	private Double Solde_Conge;
	private String Dernier_maj_solde_conge;
	private String Etat;
	private String Status;
	private String NomPrenom;
	private String Societe;
	private String NumPost;
	private String Direction;
	private String resp_dep;
	private String Groupe;
	private String Date_DernierPret;
	private String NbrPret;
	private String PL;
	private String photo_profil;
	private Integer role;
	private int tel;
	private String fonction;
	private String site;
	private String date_recrutement;
	private String PhoneNumber;
	private String PhoneNumberConfirmed;

	public int getTel() {
		return tel;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getDate_recrutement() {
		return date_recrutement;
	}

	public void setDate_recrutement(String date_recrutement) {
		this.date_recrutement = date_recrutement;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getPhoneNumberConfirmed() {
		return PhoneNumberConfirmed;
	}

	public void setPhoneNumberConfirmed(String phoneNumberConfirmed) {
		PhoneNumberConfirmed = phoneNumberConfirmed;
	}

	public String getSignataire() {
		return signataire;
	}

	public void setSignataire(String signataire) {
		this.signataire = signataire;
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

	public String getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}

	public String getRecrutement() {
		return recrutement;
	}

	public void setRecrutement(String recrutement) {
		this.recrutement = recrutement;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getEmailConfirmed() {
		return EmailConfirmed;
	}

	public void setEmailConfirmed(String emailConfirmed) {
		EmailConfirmed = emailConfirmed;
	}

	public Double getSolde_Conge() {
		return Solde_Conge;
	}

	public void setSolde_Conge(Double solde_Conge) {
		Solde_Conge = solde_Conge;
	}

	public String getDernier_maj_solde_conge() {
		return Dernier_maj_solde_conge;
	}

	public void setDernier_maj_solde_conge(String dernier_maj_solde_conge) {
		Dernier_maj_solde_conge = dernier_maj_solde_conge;
	}

	public String getEtat() {
		return Etat;
	}

	public void setEtat(String etat) {
		Etat = etat;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getNomPrenom() {
		return NomPrenom;
	}

	public void setNomPrenom(String nomPrenom) {
		NomPrenom = nomPrenom;
	}

	public String getSociete() {
		return Societe;
	}

	public void setSociete(String societe) {
		Societe = societe;
	}

	public String getNumPost() {
		return NumPost;
	}

	public void setNumPost(String numPost) {
		NumPost = numPost;
	}

	public String getDirection() {
		return Direction;
	}

	public void setDirection(String direction) {
		Direction = direction;
	}

	public String getGroupe() {
		return Groupe;
	}

	public void setGroupe(String groupe) {
		Groupe = groupe;
	}

	public String getDate_DernierPret() {
		return Date_DernierPret;
	}

	public void setDate_DernierPret(String date_DernierPret) {
		Date_DernierPret = date_DernierPret;
	}

	public String getNbrPret() {
		return NbrPret;
	}

	public void setNbrPret(String nbrPret) {
		NbrPret = nbrPret;
	}

	public String getPL() {
		return PL;
	}

	public void setPL(String pL) {
		PL = pL;
	}

	public String getPhoto_profil() {
		return photo_profil;
	}

	public void setPhoto_profil(String photo_profil) {
		this.photo_profil = photo_profil;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getRole() {
		return role;
	}

	public String getResp_dep() {
		return resp_dep;
	}

	public void setResp_dep(String resp_dep) {
		this.resp_dep = resp_dep;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

}
