package tn.teriak.security.services;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

import tn.teriak.model.User;

public class UserDetailsImpl implements UserDetails {
  private static final long serialVersionUID = 1L;

  private Integer id;

  private String username;
  private String matricule;


  private String email;

  @JsonIgnore
  private String password;
  

  private Collection<? extends GrantedAuthority> authorities;
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
	
	private String Groupe;
	private String Date_DernierPret;
	private String NbrPret;
	private String PL;
	private String photo_profil;
	private String resp_dep;
	private String fonction;
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

	private   String site;
	


 

 

public UserDetailsImpl(Integer id, String username,String matricule, String email, String password,
			Collection<? extends GrantedAuthority> authorities, String nom, String prenom, String signataire,
			String date_naissance, String recrutement, String service, String emailConfirmed, Double solde_Conge,
			String dernier_maj_solde_conge, String etat, String status, String nomPrenom, String societe,
			String numPost, String direction, String groupe, String date_DernierPret, String nbrPret, String pL,
			String photo_profil, String resp_dep,String site,String fonction) {
		super();
		this.id = id;
		this.username = username;
		this.matricule=matricule;
		this.email = email;
		this.password = password;
		this.authorities = authorities;
		this.nom = nom;
		this.prenom = prenom;
		this.signataire = signataire;
		this.date_naissance = date_naissance;
		this.recrutement = recrutement;
		this.service = service;
		EmailConfirmed = emailConfirmed;
		Solde_Conge = solde_Conge;
		Dernier_maj_solde_conge = dernier_maj_solde_conge;
		Etat = etat;
		Status = status;
		NomPrenom = nomPrenom;
		Societe = societe;
		NumPost = numPost;
		Direction = direction;
		Groupe = groupe;
		Date_DernierPret = date_DernierPret;
		NbrPret = nbrPret;
		PL = pL;
		this.photo_profil = photo_profil;
		this.resp_dep = resp_dep;
		this.site=site;
		this.fonction=fonction;
	}

public String getMatricule() {
	return matricule;
}

public void setMatricule(String matricule) {
	this.matricule = matricule;
}

public static UserDetailsImpl build(User user) {
	    List<GrantedAuthority> authorities = user.getRoles().stream()
	        .map(role -> new SimpleGrantedAuthority(role.getName().name()))
	        .collect(Collectors.toList());

    return new UserDetailsImpl(
        user.getId(), 
        user.getUsername(),user.getMatricule(), 
        user.getEmail(),
        user.getPassword(), 
        authorities,user.getNom(),user.getPrenom(),user.getSignataire(),user.getDate_naissance(),user.getRecrutement(),user.getService(),user.getEmailConfirmed(),user.getSolde_Conge(),user.getDernier_maj_solde_conge(),user.getEtat(),user.getStatus(),user.getNomPrenom(),user.getSociete(),user.getNumPost(),user.getDirection(),user.getGroupe(),user.getDate_DernierPret(),user.getNbrPret(),user.getPL(),user.getPhoto_profil(),user.getResp_dep(),user.getSite(),user.getFonction());
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

public String getSignataire() {
	return signataire;
}

public void setSignataire(String signataire) {
	this.signataire = signataire;
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

public String getResp_dep() {
	return resp_dep;
}

public void setResp_dep(String resp_dep) {
	this.resp_dep = resp_dep;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

public void setId(Integer id) {
	this.id = id;
}

public void setUsername(String username) {
	this.username = username;
}

public void setEmail(String email) {
	this.email = email;
}

public void setPassword(String password) {
	this.password = password;
}

public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
	this.authorities = authorities;
}

@Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return authorities;
  }

  public Integer getId() {
    return id;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public String getUsername() {
    return username;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    UserDetailsImpl user = (UserDetailsImpl) o;
    return Objects.equals(id, user.id);
  }
}
