package tn.teriak.payload.response;

import java.util.List;

public class JwtResponse {
  private String token;
  private String type = "Bearer";
  private Integer id;
  private String username;
  private String email;
  private List<String> roles;
  private String signataire;
  private String site ;
  private String nomprenom;
 
  private String service;
  private String fonction;
  private String matricule;
	private Double Solde_Conge;
	private String Societe;
	private String direction;
	private String Dernier_maj_solde_conge;



  

 

  public String getDernier_maj_solde_conge() {
		return Dernier_maj_solde_conge;
	}

	public void setDernier_maj_solde_conge(String dernier_maj_solde_conge) {
		Dernier_maj_solde_conge = dernier_maj_solde_conge;
	}

public String getMatricule() {
	return matricule;
}

public void setMatricule(String matricule) {
	this.matricule = matricule;
}

public String getFonction() {
	return fonction;
}

public void setFonction(String fonction) {
	this.fonction = fonction;
}

public String getSignataire() {
	return signataire;
}

public void setSignataire(String signataire) {
	this.signataire = signataire;
}






public JwtResponse(String token, String type, Integer id, String username, String email, List<String> roles,
		String signataire, String site, String nomprenom, String service, String fonction,String matricule, Double Solde_Conge,String Societe,String direction,String Dernier_maj_solde_conge) {
	super();
	this.token = token;
	this.type = type;
	this.id = id;
	this.username = username;
	this.email = email;
	this.roles = roles;
	this.signataire = signataire;
	this.site = site;
	this.nomprenom = nomprenom;
	this.service = service;
	this.fonction = fonction;
	this.matricule=matricule;
	this.Solde_Conge=Solde_Conge;
	this.Societe=Societe;
	this.direction=direction;
	this.Dernier_maj_solde_conge=Dernier_maj_solde_conge;
}

public String getDirection() {
	return direction;
}

public void setDirection(String direction) {
	this.direction = direction;
}

public Double getSolde_Conge() {
	return Solde_Conge;
}

public void setSolde_Conge(Double solde_Conge) {
	Solde_Conge = solde_Conge;
}

public String getToken() {
	return token;
}

public void setToken(String token) {
	this.token = token;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getSite() {
	return site;
}

public void setSite(String site) {
	this.site = site;
}

public String getNomprenom() {
	return nomprenom;
}

public void setNomprenom(String nomprenom) {
	this.nomprenom = nomprenom;
}








public String getService() {
	return service;
}

public void setService(String service) {
	this.service = service;
}

public void setRoles(List<String> roles) {
	this.roles = roles;
}

public String getAccessToken() {
    return token;
  }

  public void setAccessToken(String accessToken) {
    this.token = accessToken;
  }

  public String getTokenType() {
    return type;
  }

  public void setTokenType(String tokenType) {
    this.type = tokenType;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public List<String> getRoles() {
    return roles;
  }

public String getSociete() {
	return Societe;
}

public void setSociete(String societe) {
	Societe = societe;
}
  
}
