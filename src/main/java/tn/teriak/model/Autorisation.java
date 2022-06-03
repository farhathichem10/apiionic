package tn.teriak.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Autorisation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String Jourdautorisation;
	private String Heuredebut;
	private String Heurefin;
	private String description;
	@ManyToOne @JoinColumn(name="user_id")
	private User user;
	private String reponserh;
	private String reponsesup;
	private String sup_hearchique;
	private String Date_emission;
	private String fonction;
	private String service;
	private String nomprenom;
	private String site;

	


	
	public Autorisation() {
		super();
	}
	
	
	


	public Autorisation(Integer id, String jourdautorisation, String heuredebut, String heurefin, String description,
			User user, String reponserh, String reponsesup, String sup_hearchique, String date_emission,
			String fonction, String service, String nomprenom, String site) {
		super();
		this.id = id;
		Jourdautorisation = jourdautorisation;
		Heuredebut = heuredebut;
		Heurefin = heurefin;
		this.description = description;
		this.user = user;
		this.reponserh = reponserh;
		this.reponsesup = reponsesup;
		this.sup_hearchique = sup_hearchique;
		Date_emission = date_emission;
		this.fonction = fonction;
		this.service = service;
		this.nomprenom = nomprenom;
		this.site = site;
	}





	public String getFonction() {
		return fonction;
	}





	public void setFonction(String fonction) {
		this.fonction = fonction;
	}





	public String getService() {
		return service;
	}





	public void setService(String service) {
		this.service = service;
	}





	public String getNomprenom() {
		return nomprenom;
	}





	public void setNomprenom(String nomprenom) {
		this.nomprenom = nomprenom;
	}





	public String getSite() {
		return site;
	}





	public void setSite(String site) {
		this.site = site;
	}





	public String getReponserh() {
		return reponserh;
	}

	public void setReponserh(String reponserh) {
		this.reponserh = reponserh;
	}

	public String getReponsesup() {
		return reponsesup;
	}

	public void setReponsesup(String reponsesup) {
		this.reponsesup = reponsesup;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getJourdautorisation() {
		return Jourdautorisation;
	}
	public void setJourdautorisation(String jourdautorisation) {
		Jourdautorisation = jourdautorisation;
	}
	public String getHeuredebut() {
		return Heuredebut;
	}
	public void setHeuredebut(String heuredebut) {
		Heuredebut = heuredebut;
	}
	public String getHeurefin() {
		return Heurefin;
	}
	public void setHeurefin(String heurefin) {
		Heurefin = heurefin;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}


	public String getSup_hearchique() {
		return sup_hearchique;
	}


	public void setSup_hearchique(String sup_hearchique) {
		this.sup_hearchique = sup_hearchique;
	}


	public String getDate_emission() {
		return Date_emission;
	}


	public void setDate_emission(String date_emission) {
		Date_emission = date_emission;
	}
	
	

}
