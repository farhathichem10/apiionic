package tn.teriak.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Congee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String premierjour;
	private String Heuredebut;
	private String Heurefin;
	private String dernierjour;
	@ManyToOne @JoinColumn(name="user_id")
	private User user;
	private String reponserh;
	private String reponsesup;
	private String sup_hearchique;
	private String Datetime;
	private String fonction;
	private String service;
	private String nomprenom;
	private String site;
	public Congee() {
		super();
	}



	public String getDatetime() {
		return Datetime;
	}



	public void setDatetime(String datetime) {
		Datetime = datetime;
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



	public Congee(Integer id, String premierjour, String heuredebut, String heurefin, String dernierjour, User user,
			String reponserh, String reponsesup, String sup_hearchique, String datetime, String fonction,
			String service, String nomprenom, String site) {
		super();
		this.id = id;
		this.premierjour = premierjour;
		Heuredebut = heuredebut;
		Heurefin = heurefin;
		this.dernierjour = dernierjour;
		this.user = user;
		this.reponserh = reponserh;
		this.reponsesup = reponsesup;
		this.sup_hearchique = sup_hearchique;
		Datetime = datetime;
		this.fonction = fonction;
		this.service = service;
		this.nomprenom = nomprenom;
		this.site = site;
	}



	public String getSup_hearchique() {
		return sup_hearchique;
	}

	public void setSup_hearchique(String sup_hearchique) {
		this.sup_hearchique = sup_hearchique;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPremierjour() {
		return premierjour;
	}
	public void setPremierjour(String premierjour) {
		this.premierjour = premierjour;
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
	public String getDernierjour() {
		return dernierjour;
	}
	public void setDernierjour(String dernierjour) {
		this.dernierjour = dernierjour;
	}
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
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

}
